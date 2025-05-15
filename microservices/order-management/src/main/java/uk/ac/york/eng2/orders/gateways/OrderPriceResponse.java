package uk.ac.york.eng2.orders.gateways;

import java.math.BigDecimal;
import java.util.Map;

public record OrderPriceResponse(Map<Long, BigDecimal> itemPrices, BigDecimal orderTotal) {
}
