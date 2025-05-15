package uk.ac.york.eng2.orders.gateways;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.api.ProductsApi;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Singleton
public class PMProductPricingGateway implements ProductPricingGateway {

    @Inject
    private ProductsApi productsApi;

    @Override
    public Optional<OrderPriceResponse> getOrderPrice(Map<Long, Integer> orderItems){
        try {
            Map<String, Integer> request = new HashMap<>();
            for (Map.Entry<Long, Integer> entry : orderItems.entrySet()) {
                request.put(entry.getKey().toString(), entry.getValue());
            }

            Map<String,Object> response = productsApi.priceOrder(request);

            Map<String, Double> itemPricesResponse = (Map<String, Double>) response.get("items");
            Map<Long, BigDecimal> itemPrices = new HashMap<>();
            for (Map.Entry<String, Double> entry : itemPricesResponse.entrySet()) {
                itemPrices.put(Long.parseLong(entry.getKey()), BigDecimal.valueOf(entry.getValue()));
            }

            BigDecimal totalPrice = BigDecimal.valueOf((double) response.get("total"));

            return Optional.of(new OrderPriceResponse(itemPrices, totalPrice));
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

}
