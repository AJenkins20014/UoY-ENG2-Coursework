package uk.ac.york.eng2.orders.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

import java.time.LocalDate;
import java.util.HashMap;

@KafkaClient
public interface OrdersProducer {
    @Topic(OrdersTopicFactory.ORDER_CREATED_TOPIC)
    void orderCreated(OrdersCreated orderItems);
}
