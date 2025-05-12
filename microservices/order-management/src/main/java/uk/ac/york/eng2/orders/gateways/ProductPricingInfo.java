package uk.ac.york.eng2.orders.gateways;

import java.math.BigDecimal;

public class ProductPricingInfo {
    public BigDecimal price;

    public ProductPricingInfo(){
        price = new BigDecimal(0);
    }

    public ProductPricingInfo(BigDecimal bigDecimal) {
        price = bigDecimal;
    }
}
