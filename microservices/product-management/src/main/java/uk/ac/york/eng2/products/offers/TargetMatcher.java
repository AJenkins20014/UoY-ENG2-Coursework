package uk.ac.york.eng2.products.offers;

import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.*;

public class TargetMatcher {

    /* ──────────────────────────────────────────────────────────────
       Public helpers
       ──────────────────────────────────────────────────────────── */
    public static Set<Long> getMatchingProductIds(OrderContext ctx,
                                                  TargetGroup tg,
                                                  ProductRepository productRepo,
                                                  TagRepository tagRepo) {
        return internalMatch(ctx.orderItems, tg, productRepo, tagRepo);
    }

    public static Set<Long> getMatchingProductIdsFrom(Map<Long, Integer> map,
                                                      TargetGroup tg,
                                                      ProductRepository productRepo,
                                                      TagRepository tagRepo) {
        return internalMatch(map, tg, productRepo, tagRepo);
    }

    public static int getQuantityForMap(Map<Long,Integer> map, Set<Long> ids) {
        return ids.stream().mapToInt(id -> map.getOrDefault(id, 0)).sum();
    }

    public static int getQuantityFor(OrderContext ctx, Set<Long> ids) {
        return getQuantityForMap(ctx.orderItems, ids);
    }

    /* Combine matches from several TargetGroups */
    public static Set<Long> getMatchingProductIdsByMatchType(OrderContext ctx,
                                                             List<TargetGroup> groups,
                                                             TargetGroup.MatchType overall,
                                                             ProductRepository pr,
                                                             TagRepository tr) {
        if (groups.isEmpty()) return Collections.emptySet();
        Set<Long> result = internalMatch(ctx.orderItems, groups.get(0), pr, tr);
        for (int i = 1; i < groups.size(); i++) {
            if (overall == TargetGroup.MatchType.ANY) {
                result.addAll(internalMatch(ctx.orderItems, groups.get(i), pr, tr));
            } else { // ALL
                result.retainAll(internalMatch(ctx.orderItems, groups.get(i), pr, tr));
            }
        }
        return result;
    }

    /* ──────────────────────────────────────────────────────────────
       Core logic (shared)
       ──────────────────────────────────────────────────────────── */
    private static Set<Long> internalMatch(Map<Long,Integer> items,
                                           TargetGroup tg,
                                           ProductRepository pr,
                                           TagRepository tr) {

        Set<Long> match = new HashSet<>();
        boolean wantAny = tg.getMatchType() == TargetGroup.MatchType.ANY;

        for (Long pid : items.keySet()) {

            /* ------------ product name check (ALL vs ANY same) ---- */
            boolean nameMatch = tg.getProducts().isEmpty() ||       // no names required
                    pr.findById(pid)
                            .map(Product::getName)
                            .filter(tg.getProducts()::contains)
                            .isPresent();

            /* ------------ tag check (respect ALL / ANY) ---------- */
            boolean tagMatch = tg.getTags().isEmpty();              // empty list ⇒ trivially true
            if (!tg.getTags().isEmpty()) {
                List<Tag> productTags = tr.findByProductsId(pid);
                if (wantAny) {
                    tagMatch = productTags.stream()
                            .anyMatch(t -> tg.getTags().contains(t.getName()));
                } else {
                    tagMatch = tg.getTags().stream()
                            .allMatch(req -> productTags.stream()
                                    .anyMatch(t -> t.getName().equals(req)));
                }
            }

            /* ------------ final decision ------------------------- */
            boolean matched = wantAny ? (nameMatch || tagMatch)
                    : (nameMatch && tagMatch);

            if (matched) match.add(pid);
        }
        return match;
    }

    private TargetMatcher() {}   // utility class — no instances
}
