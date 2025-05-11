package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

import java.math.BigDecimal;

@KafkaClient
public interface ProductsProducer {

    @Topic(ProductsTopicFactory.ITEM_PRICE_CONFIRMED_TOPIC)
    void itemPriceConfirmed(@KafkaKey long orderItemId, String priceStr);
}
