package uk.ac.york.eng2.products.offers.actions;

import uk.ac.york.eng2.products.offers.OrderContext;
import uk.ac.york.eng2.products.offers.TargetGroup;
import uk.ac.york.eng2.products.offers.TargetMatcher;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;


public class PercentageDiscountAction {

    public static OrderContext apply(OrderContext context, double percentage, int maxQuantity, boolean wholeOrder,
                                     List<TargetGroup> targets, TargetGroup.MatchType matchType,
                                     ProductRepository productRepository, TagRepository tagRepository) {


        BigDecimal multiplier = BigDecimal.ONE.subtract(BigDecimal.valueOf(percentage).divide(BigDecimal.valueOf(100d))).setScale(4, RoundingMode.HALF_UP);


        if (wholeOrder) {
            context.totalPrice = context.totalPrice.multiply(multiplier).setScale(2, RoundingMode.HALF_UP);
            return context;
        }


        Set<Long> matchingIds = TargetMatcher.getMatchingProductIdsByMatchType(context, targets, matchType, productRepository, tagRepository);

        if (matchingIds.isEmpty()) {
            return context;
        }

        int limit = (maxQuantity <= 0) ? Integer.MAX_VALUE : maxQuantity;
        int discountedProducts = 0;

        for (Long pid : matchingIds) {
            int quantity = context.orderItems.get(pid);
            for (int i = 0; i < quantity; i++) {
                if (discountedProducts >= limit) {
                    break;
                }

                BigDecimal linePrice = context.itemPrices.get(pid);
                BigDecimal unitPrice = productRepository.findById(pid).get().getUnitPrice();

                BigDecimal newLinePrice = linePrice.subtract(unitPrice);
                newLinePrice = newLinePrice.add(unitPrice.multiply(multiplier).setScale(2, RoundingMode.HALF_UP));

                // Update line price
                context.itemPrices.put(pid, newLinePrice);

                // Update order total
                context.totalPrice = context.totalPrice.subtract(linePrice);
                context.totalPrice = context.totalPrice.add(newLinePrice);

                discountedProducts++;
            }
        }

        return context;
    }
}
