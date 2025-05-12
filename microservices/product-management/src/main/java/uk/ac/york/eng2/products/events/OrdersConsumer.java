package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;


import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

@KafkaListener(groupId="orders", threads = 3, offsetReset = OffsetReset.EARLIEST)
public class OrdersConsumer {

    @Inject
    ProductRepository productRepository;

    @Inject
    OrdersByDayRepository ordersByDayRepository;

    @Transactional
    @Topic(OrdersTopics.ORDER_CREATED_TOPIC)
    public void orderCreated(OrdersCreated ordersCreated) {
        LocalDate day = ordersCreated.day();

        for (Map.Entry<Long, Integer> entry : ordersCreated.orderItems().entrySet()) {
            Long productId = entry.getKey();
            int quantity = entry.getValue();

            Product product = productRepository.findById(productId).orElseThrow(() ->
                    new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found")
            );

            Optional<OrdersByDay> existing = ordersByDayRepository.findByProductIdAndDay(productId, day);

            if (existing.isPresent()) {
                OrdersByDay record = existing.get();
                record.setCount(record.getCount() + quantity);
                ordersByDayRepository.update(record);
            } else {
                OrdersByDay newRecord = new OrdersByDay();
                newRecord.setProduct(product);
                newRecord.setDay(day);
                newRecord.setCount(quantity);
                ordersByDayRepository.save(newRecord);
            }
        }
    }
}
