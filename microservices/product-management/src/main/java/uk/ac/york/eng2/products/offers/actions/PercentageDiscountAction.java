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

        BigDecimal multiplier = BigDecimal.ONE
                .subtract(BigDecimal.valueOf(percentage).divide(BigDecimal.valueOf(100d))).setScale(4, RoundingMode.HALF_UP);


        if (wholeOrder) {
            context.totalPrice = context.totalPrice.multiply(multiplier).setScale(2, RoundingMode.HALF_UP);
            return context;
        }


        Set<Long> matchingIds = TargetMatcher.getMatchingProductIdsByMatchType(context, targets, matchType, productRepository, tagRepository);

        if (matchingIds.isEmpty()) {
            return context;
        }

        int limit = (maxQuantity <= 0) ? matchingIds.size() : maxQuantity;
        int discountedProducts = 0;

        for (Long id : matchingIds) {
            if (discountedProducts >= limit) {
                break;
            }
            BigDecimal oldUnit = context.itemPrices.get(id);
            if (oldUnit == null) continue;

            BigDecimal newUnit = oldUnit.multiply(multiplier).setScale(2, RoundingMode.HALF_UP);

            // Update item price
            context.itemPrices.put(id, newUnit);

            // Update order total
            int qty = context.orderItems.getOrDefault(id, 0);
            BigDecimal perUnit = oldUnit.subtract(newUnit);
            context.totalPrice = context.totalPrice.subtract(perUnit.multiply(BigDecimal.valueOf(qty)));

            discountedProducts++;
        }

        return context;
    }
}
