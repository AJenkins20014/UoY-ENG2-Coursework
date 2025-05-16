package uk.ac.york.eng2.products.offers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderContext {
    public Map<Long, Integer> orderItems;
    public Map<Long, BigDecimal> itemPrices;
    public BigDecimal totalPrice;
    public LocalDate orderDate;


    public OrderContext(Map<Long, Integer> orderItems, Map<Long, BigDecimal> itemPrices, BigDecimal totalPrice, LocalDate orderDate) {
        this.orderItems = new HashMap<>(orderItems);
        this.itemPrices = new HashMap<>(itemPrices);
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }

}
