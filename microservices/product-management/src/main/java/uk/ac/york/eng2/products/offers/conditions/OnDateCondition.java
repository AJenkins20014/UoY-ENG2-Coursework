package uk.ac.york.eng2.products.offers.conditions;

import uk.ac.york.eng2.products.offers.Date;
import uk.ac.york.eng2.products.offers.OrderContext;

import java.time.LocalDate;

public class OnDateCondition {

    public static int isValid(OrderContext context, Date startDate, Date endDate){

        LocalDate start = LocalDate.of(startDate.getYear(), startDate.getMonth(), startDate.getDay());
        LocalDate end = LocalDate.of(endDate.getYear(), endDate.getMonth(), endDate.getDay());

        if (!context.orderDate.isBefore(start) && context.orderDate.isBefore(end.plusDays(1))){
            return 1;
        }
        else return 0;
    }
}