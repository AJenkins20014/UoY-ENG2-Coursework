package uk.ac.york.eng2.orders.events;

import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Serdeable
public record OrdersCreated(LocalDate day, HashMap<Long, Integer> orderItems) {

}
