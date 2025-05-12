package uk.ac.york.eng2.orders.gateways;

import java.math.BigDecimal;
import java.util.Optional;

public interface ProductPricingGateway {
    Optional<ProductPricingInfo> getProductPrice(Long productId);
}
