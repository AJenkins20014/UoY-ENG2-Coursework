package uk.ac.york.eng2.products.offers.actions;

import uk.ac.york.eng2.products.offers.OrderContext;
import uk.ac.york.eng2.products.offers.TargetGroup;
import uk.ac.york.eng2.products.offers.TargetMatcher;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;


public class SetPriceAction {

    public static OrderContext apply(OrderContext context, double amount, int maxQuantity, boolean wholeOrder,
                                     List<TargetGroup> targets, TargetGroup.MatchType matchType,
                                     ProductRepository productRepository, TagRepository tagRepository) {

        BigDecimal newUnitPrice = BigDecimal.valueOf(amount).setScale(2, RoundingMode.HALF_UP);

        if (wholeOrder) {
            context.totalPrice = newUnitPrice;
            return context;
        }


        Set<Long> matchingIds = TargetMatcher.getMatchingProductIdsByMatchType(context, targets, matchType, productRepository, tagRepository);

        if (matchingIds.isEmpty()) {
            return context;
        }

        int limit = (maxQuantity <= 0) ? matchingIds.size() : maxQuantity;
        int updatedProducts = 0;

        for (Long pid : matchingIds) {
            if (updatedProducts >= limit) {
                break;
            }

            BigDecimal oldUnit = context.itemPrices.get(pid);
            if (oldUnit == null) continue;

            // Recalculate order total
            int qty = context.orderItems.getOrDefault(pid, 0);
            BigDecimal perUnit = oldUnit.subtract(newUnitPrice);

            context.totalPrice = context.totalPrice.subtract(perUnit.multiply(BigDecimal.valueOf(qty)));

            // Override unit price
            context.itemPrices.put(pid, newUnitPrice);

            updatedProducts++;
        }

        return context;
    }
}