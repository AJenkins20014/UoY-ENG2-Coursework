package uk.ac.york.eng2.orders.gateways;

import java.util.Map;
import java.util.Optional;

public interface ProductPricingGateway {
    Optional<OrderPriceResponse> getOrderPrice(Map<Long, Integer> orderItems);
}
