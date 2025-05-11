package uk.ac.york.eng2.products.events;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

@Requires(bean = AdminClient.class)
@Factory
public class ProductsTopicFactory {

    public static final String ITEM_PRICE_CONFIRMED_TOPIC = "item-price-confirmed";

    @Bean
    public NewTopic itemPriceConfirmedTopic() {
        return new NewTopic(ITEM_PRICE_CONFIRMED_TOPIC, 3, (short) 1);
    }
}
