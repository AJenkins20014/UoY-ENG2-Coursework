//package uk.ac.york.eng2.orders.events;
//
//import io.micronaut.configuration.kafka.annotation.KafkaKey;
//import io.micronaut.configuration.kafka.annotation.KafkaListener;
//import io.micronaut.configuration.kafka.annotation.OffsetReset;
//import io.micronaut.configuration.kafka.annotation.Topic;
//import io.micronaut.http.HttpStatus;
//import io.micronaut.http.exceptions.HttpStatusException;
//import io.micronaut.transaction.annotation.Transactional;
//import jakarta.inject.Inject;
//import uk.ac.york.eng2.orders.domain.OrderItem;
//import uk.ac.york.eng2.orders.repository.OrderItemRepository;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//@KafkaListener(groupId="products", threads = 3, offsetReset = OffsetReset.EARLIEST)
//public class ProductsConsumer {
//
//    @Inject
//    OrderItemRepository orderItemRepository;
//
//    @Transactional
//    @Topic(ProductsTopics.ITEM_PRICE_CONFIRMED_TOPIC)
//    public void itemPriceConfirmed(@KafkaKey long orderItemId, String priceStr) {
//        // Update price of item
//        OrderItem orderItem = orderItemRepository.findById(orderItemId).orElseThrow(() ->
//                new HttpStatusException(HttpStatus.NOT_FOUND, "Order item not found")
//        );
//
//        BigDecimal price = new BigDecimal(priceStr);
//        orderItem.setUnitPrice(price);
//
//        // Update price of order
//        BigDecimal totalPrice = getOrderTotal(orderItemRepository.findByOrderId(orderItem.getOrder().getId()));
//        orderItem.getOrder().setTotalAmount(totalPrice);
//    }
//
//    /***
//     * Calculates the total of all order items in an order.
//     * @param orderItems A list of all order items in the order.
//     * @return The total price of the order.
//     */
//    private BigDecimal getOrderTotal(List<OrderItem> orderItems) {
//        BigDecimal total = BigDecimal.ZERO;
//
//        for (OrderItem item : orderItems) {
//            BigDecimal itemPrice = item.getUnitPrice();
//            itemPrice = itemPrice.multiply(BigDecimal.valueOf(item.getQuantity()));
//
//            total = total.add(itemPrice);
//        }
//
//        return total;
//    }
//}
//