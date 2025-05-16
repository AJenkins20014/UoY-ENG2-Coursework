package uk.ac.york.eng2.products.offers.actions;

import uk.ac.york.eng2.products.offers.OrderContext;

import java.math.BigDecimal;

public class FlatDiscountAction {

    public static OrderContext apply(OrderContext context, double amount) {

        // No need to apply to individual items as this is a flat discount

        context.totalPrice = context.totalPrice.subtract(BigDecimal.valueOf(amount));

        return context;
    }
}
