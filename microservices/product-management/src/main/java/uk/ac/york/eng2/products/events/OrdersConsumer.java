package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.math.BigDecimal;

@KafkaListener(groupId="orders", threads = 3, offsetReset = OffsetReset.EARLIEST)
public class OrdersConsumer {

    @Inject
    ProductRepository productRepository;

    @Inject
    ProductsProducer productsProducer;

    @Transactional
    @Topic(OrdersTopics.ORDERITEM_CREATED_TOPIC)
    public void orderItemCreated(@KafkaKey long orderItemId, Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(() ->
                new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found")
        );

        BigDecimal price = product.getUnitPrice();

        productsProducer.itemPriceConfirmed(orderItemId, price.toPlainString());
    }



}
