package uk.ac.york.eng2.products.offers.actions;

import uk.ac.york.eng2.products.offers.OrderContext;
import uk.ac.york.eng2.products.offers.TargetGroup;
import uk.ac.york.eng2.products.offers.TargetMatcher;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Set;

public class SetPriceAction {

    public static OrderContext apply(OrderContext context, double amount, int maxQuantity, boolean wholeOrder,
                                     List<TargetGroup> targets, TargetGroup.MatchType matchType,
                                     ProductRepository productRepository, TagRepository tagRepository) {

        BigDecimal newUnit = BigDecimal.valueOf(amount).setScale(2, RoundingMode.HALF_UP);

        if (wholeOrder) {
            context.totalPrice = BigDecimal.valueOf(amount);
            return context;
        }

        Set<Long> ids = TargetMatcher.getMatchingProductIdsByMatchType(context, targets, matchType, productRepository, tagRepository);
        if (ids.isEmpty()) return context;

        int unitsLeft = (maxQuantity <= 0) ? Integer.MAX_VALUE : maxQuantity;

        for (Long pid : ids) {
            if (unitsLeft == 0) break;

            int qty = context.orderItems.getOrDefault(pid, 0);
            if (qty == 0) continue;

            BigDecimal unitPrice = productRepository.findById(pid).get().getUnitPrice().setScale(2);
            BigDecimal oldLine = context.itemPrices.get(pid);

            int fullPricedUnits = oldLine.divide(unitPrice, 0, RoundingMode.DOWN).intValue();
            if (fullPricedUnits == 0) continue;

            int unitsToAdjust = Math.min(unitsLeft, fullPricedUnits);

            BigDecimal diffPerUnit = unitPrice.subtract(newUnit);
            BigDecimal lineDiscount = diffPerUnit.multiply(BigDecimal.valueOf(unitsToAdjust));

            // Update totals
            context.totalPrice = context.totalPrice.subtract(lineDiscount).setScale(2, RoundingMode.HALF_UP);
            BigDecimal newLine = oldLine.subtract(lineDiscount);
            context.itemPrices.put(pid, newLine);

            unitsLeft -= unitsToAdjust;
        }

        return context;
    }
}
