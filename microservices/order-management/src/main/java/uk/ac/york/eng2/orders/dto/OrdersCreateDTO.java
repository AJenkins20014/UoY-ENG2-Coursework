package uk.ac.york.eng2.orders.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Date;
import java.util.Map;

@Serdeable
public class OrdersCreateDTO {
    private String address;

    private boolean paid, delivered = false;

    private Map<Long, Integer> OrderItems;

    private Long customerId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Map<Long, Integer> getOrderItems() {
        return OrderItems;
    }

    public void setOrderItems(Map<Long, Integer> orderItems) {
        OrderItems = orderItems;
    }
}
