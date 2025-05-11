package uk.ac.york.eng2.orders.events;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

@Requires(bean = AdminClient.class)
@Factory
public class OrdersTopicFactory {

    public static final String ORDERITEM_CREATED_TOPIC = "orderItem-created";

    @Bean
    public NewTopic orderItemCreatedTopic() {
        return new NewTopic(ORDERITEM_CREATED_TOPIC, 3, (short) 1);
    }
}
