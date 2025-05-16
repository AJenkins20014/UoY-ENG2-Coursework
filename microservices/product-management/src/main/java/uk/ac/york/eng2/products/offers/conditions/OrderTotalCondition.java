package uk.ac.york.eng2.products.offers.conditions;

import uk.ac.york.eng2.products.offers.OrderContext;

public class OrderTotalCondition {

    public static int isValid(OrderContext context, double minTotal, double maxTotal) {
        if(maxTotal <= context.totalPrice.doubleValue() && context.totalPrice.doubleValue() >= minTotal){
            return 1;
        }
        else return 0;
    }
}
