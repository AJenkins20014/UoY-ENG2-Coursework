package uk.ac.york.eng2.orders.gateways;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.api.ProductsApi;

import java.math.BigDecimal;
import java.util.Optional;

@Singleton
public class PMProductPricingGateway implements ProductPricingGateway {

    @Inject
    private ProductsApi productsApi;

    @Override
    public Optional<ProductPricingInfo> getProductPrice(Long productId){
        try {
            BigDecimal price = productsApi.getProductPrice(productId);
            ProductPricingInfo info = new ProductPricingInfo();
            info.price = price;
            System.out.printf(price.toPlainString() + " for " + productId + "\n");
            return Optional.of(info);
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

}
