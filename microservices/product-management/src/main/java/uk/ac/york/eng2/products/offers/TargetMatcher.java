package uk.ac.york.eng2.products.offers;

import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.*;

public class TargetMatcher {

    public static Set<Long> getMatchingProductIdsFrom(Map<Long, Integer> map, TargetGroup targetGroup,
                                                      ProductRepository productRepository, TagRepository tagRepository) {
        return internalMatch(map, targetGroup, productRepository, tagRepository);
    }

    public static int getQuantityForMap(Map<Long,Integer> map, Set<Long> ids) {
        return ids.stream().mapToInt(id -> map.getOrDefault(id, 0)).sum();
    }

    public static Set<Long> getMatchingProductIdsByMatchType(OrderContext context, List<TargetGroup> targetGroups, TargetGroup.MatchType overall,
                                                             ProductRepository productRepository, TagRepository tagRepository) {
        if (targetGroups.isEmpty()) return Collections.emptySet();
        Set<Long> result = internalMatch(context.orderItems, targetGroups.get(0), productRepository, tagRepository);
        for (int i = 1; i < targetGroups.size(); i++) {
            if (overall == TargetGroup.MatchType.ANY) {
                result.addAll(internalMatch(context.orderItems, targetGroups.get(i), productRepository, tagRepository));
            } else {
                result.retainAll(internalMatch(context.orderItems, targetGroups.get(i), productRepository, tagRepository));
            }
        }
        return result;
    }


    private static Set<Long> internalMatch(Map<Long,Integer> items, TargetGroup targetGroup,
                                           ProductRepository productRepository, TagRepository tagRepository) {

        Set<Long> match = new HashSet<>();
        boolean wantAny = targetGroup.getMatchType() == TargetGroup.MatchType.ANY;

        for (Long pid : items.keySet()) {

            // Check products
            boolean nameMatch = targetGroup.getProducts().isEmpty() ||
                    productRepository.findById(pid).map(Product::getName).filter(targetGroup.getProducts()::contains).isPresent();

            // Check tags
            boolean tagMatch = targetGroup.getTags().isEmpty();
            if (!targetGroup.getTags().isEmpty()) {
                List<Tag> productTags = tagRepository.findByProductsId(pid);
                if (wantAny) {
                    tagMatch = productTags.stream().anyMatch(t -> targetGroup.getTags().contains(t.getName()));
                } else {
                    tagMatch = targetGroup.getTags().stream().allMatch(req -> productTags.stream().anyMatch(t -> t.getName().equals(req)));
                }
            }

            // Check categories here (not implemented)

            // Check match type
            boolean matched = wantAny ? (nameMatch || tagMatch) : (nameMatch && tagMatch);

            if (matched) match.add(pid);
        }
        return match;
    }
}
