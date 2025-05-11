package uk.ac.york.eng2.orders.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface OrdersProducer {
    @Topic(OrdersTopicFactory.ORDERITEM_CREATED_TOPIC)
    void orderItemCreated(@KafkaKey long orderItemId, Long productId);
}
