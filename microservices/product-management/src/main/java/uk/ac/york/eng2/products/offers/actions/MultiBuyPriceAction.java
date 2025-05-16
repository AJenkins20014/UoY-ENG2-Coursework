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

    public static OrderContext apply(OrderContext context, int  qualifyingQuantity, int  payForQuantity, Double payAmount,
                                     List<TargetGroup> targets, TargetGroup.MatchType matchType,
                                     ProductRepository productRepository, TagRepository tagRepository) {

        Set<Long> matchIds = TargetMatcher.getMatchingProductIdsByMatchType(context, targets, matchType, productRepository, tagRepository);

        if (matchIds.isEmpty()) return context;

        record Line(long id, BigDecimal price) {}
        List<Line> pool = new ArrayList<>();

        for (var e : context.orderItems.entrySet()) {
            if (!matchIds.contains(e.getKey())) continue;
            BigDecimal unit = productRepository.findById(e.getKey()).get().getUnitPrice();
            for (int i = 0; i < e.getValue(); i++) pool.add(new Line(e.getKey(), unit));
        }

        if (pool.size() < qualifyingQuantity) return context;

        List<Line> group = pool.subList(0, qualifyingQuantity);

        BigDecimal groupSum = group.stream().map(l -> l.price).reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal payForGroup;

        if (payAmount != null) {
            payForGroup = BigDecimal.valueOf(payAmount)
                    .setScale(2, RoundingMode.HALF_UP);
        } else {
            List<BigDecimal> sorted = group.stream()
                    .map(l -> l.price)
                    .sorted()
                    .toList();

            int chargeUnits = Math.min(payForQuantity, qualifyingQuantity);
            payForGroup = BigDecimal.ZERO;
            for (int i = 0; i < chargeUnits; i++)
                payForGroup = payForGroup.add(sorted.get(i));
        }

        BigDecimal discount = groupSum.subtract(payForGroup);
        if (discount.signum() > 0) {
            context.totalPrice = context.totalPrice.subtract(discount)
                    .setScale(2, RoundingMode.HALF_UP);
        }

        return context;
    }
}
