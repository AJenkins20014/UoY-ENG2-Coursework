package uk.ac.york.eng2.products.offers.conditions;

import uk.ac.york.eng2.products.offers.OrderContext;
import uk.ac.york.eng2.products.offers.TargetGroup;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;
import uk.ac.york.eng2.products.offers.TargetMatcher;

import java.util.*;

public class RequiresTargetCondition {

    public static int isValid(OrderContext context, List<TargetGroup> targets, TargetGroup.MatchType overallMatchType, int minQuantity, Integer maxQuantity,
                              ProductRepository productRepository, TagRepository tagRepository) {

        int repeatCount = 0;

        Map<Long, Integer> workingItems = new HashMap<>(context.orderItems);

        while (true) {
            boolean matchedThisRound = (overallMatchType == TargetGroup.MatchType.ALL);

            for (TargetGroup tg : targets) {
                Set<Long> matchedIds = TargetMatcher.getMatchingProductIdsFrom(workingItems, tg, productRepository, tagRepository);
                int qty = TargetMatcher.getQuantityForMap(workingItems, matchedIds);

                boolean qtyOkay = qty >= minQuantity && (maxQuantity == null || maxQuantity == 0 || qty <= maxQuantity);
                boolean groupMatched = !matchedIds.isEmpty() && qtyOkay;

                if (overallMatchType == TargetGroup.MatchType.ALL && !groupMatched) {
                    matchedThisRound = false;
                    break;
                }
                if (overallMatchType == TargetGroup.MatchType.ANY && groupMatched) {
                    matchedThisRound = true;
                    break;
                }
            }

            if (!matchedThisRound) break;

            repeatCount++;

            consumeMatchedProducts(workingItems, targets, minQuantity, productRepository, tagRepository);
        }

        return repeatCount;
    }

    private static void consumeMatchedProducts(Map<Long, Integer> items, List<TargetGroup> targets, int minQuantity,
                                        ProductRepository productRepo, TagRepository tagRepo) {

        int toRemove = minQuantity;

        for (TargetGroup tg : targets) {
            Set<Long> matchedIds = TargetMatcher.getMatchingProductIdsFrom(items, tg, productRepo, tagRepo);

            for (Long id : matchedIds) {
                int qty = items.getOrDefault(id, 0);
                if (qty == 0) continue;

                int remove = Math.min(qty, toRemove);
                items.put(id, qty - remove);
                toRemove -= remove;

                if (toRemove <= 0) return;
            }
        }
    }
}
