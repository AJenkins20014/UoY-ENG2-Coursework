package uk.ac.york.eng2.products.offers.actions;

import uk.ac.york.eng2.products.offers.OrderContext;
import uk.ac.york.eng2.products.offers.TargetGroup;
import uk.ac.york.eng2.products.offers.TargetMatcher;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class MultiBuyPriceAction {

    public static OrderContext apply(OrderContext context, int qualifyingQuantity, int payForQuantity, Double payAmount,
                                     List<TargetGroup> targets, TargetGroup.MatchType matchType,
                                     ProductRepository productRepository, TagRepository tagRepository) {


        Set<Long> matchIds = TargetMatcher.getMatchingProductIdsByMatchType(context, targets, matchType, productRepository, tagRepository);

        if (matchIds.isEmpty()) {
            return context;
        }

        record Line(long productId, BigDecimal price) {}
        List<Line> pool = new ArrayList<>();

        for (Map.Entry<Long, Integer> line : context.orderItems.entrySet()) {
            if (!matchIds.contains(line.getKey())) continue;
            BigDecimal unit = context.itemPrices.get(line.getKey());
            if (unit == null) continue;

            for (int i = 0; i < line.getValue(); i++) {
                pool.add(new Line(line.getKey(), unit));
            }
        }

        int totalUnits = pool.size();
        if (totalUnits < qualifyingQuantity) {
            return context;
        }


        BigDecimal discountTotal = BigDecimal.ZERO;
        BigDecimal fixedGroupPrice = (payAmount == null) ? null : BigDecimal.valueOf(payAmount).setScale(2, RoundingMode.HALF_UP);

        for (int idx = 0; idx + qualifyingQuantity <= totalUnits; idx += qualifyingQuantity) {

            List<Line> group = pool.subList(idx, idx + qualifyingQuantity);

            BigDecimal groupSum = BigDecimal.ZERO;
            for (Line l : group) groupSum = groupSum.add(l.price);

            BigDecimal payForThisGroup;

            if (fixedGroupPrice != null) {
                payForThisGroup = fixedGroupPrice;
            } else {
                List<BigDecimal> prices = group.stream().map(l -> l.price).sorted().toList();

                int pQty = Math.min(payForQuantity, qualifyingQuantity);
                payForThisGroup = BigDecimal.ZERO;
                for (int i = 0; i < pQty; i++) {
                    payForThisGroup = payForThisGroup.add(prices.get(i));
                }
            }

            BigDecimal groupDiscount = groupSum.subtract(payForThisGroup);
            if (groupDiscount.signum() > 0) {
                discountTotal = discountTotal.add(groupDiscount);
            }
        }


        if (discountTotal.signum() > 0) {
            context.totalPrice = context.totalPrice.subtract(discountTotal).setScale(2, RoundingMode.HALF_UP);
        }

        return context;
    }
}
