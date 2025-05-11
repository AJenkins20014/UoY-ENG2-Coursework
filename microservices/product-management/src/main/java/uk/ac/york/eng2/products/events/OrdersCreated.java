package uk.ac.york.eng2.products.events;

import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDate;
import java.util.HashMap;

@Serdeable
public record OrdersCreated(LocalDate day, HashMap<Long, Integer> orderItems) {

}
