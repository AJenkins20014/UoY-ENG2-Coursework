package uk.ac.york.eng2.products.offers;

import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.*;

public class TargetMatcher {

    public static Set<Long> getMatchingProductIds(OrderContext context, TargetGroup targetGroup,
                                                  ProductRepository productRepo, TagRepository tagRepo) {
        Set<Long> matching = new HashSet<>();

        for (Long productId : context.orderItems.keySet()) {
            boolean matchesProduct = false;
            boolean matchesTag = false;

            // Check by product name
            if (targetGroup.getProducts() != null && !targetGroup.getProducts().isEmpty()) {
                Optional<Product> productOpt = productRepo.findById(productId);
                if (productOpt.isPresent()) {
                    String productName = productOpt.get().getName();
                    if (targetGroup.getProducts().contains(productName)) {
                        matchesProduct = true;
                    }
                }
            }

            // Check by tag name
            if (targetGroup.getTags() != null && !targetGroup.getTags().isEmpty()) {
                List<Tag> tags = tagRepo.findByProductsId(productId);
                for (Tag t : tags) {
                    if (targetGroup.getTags().contains(t.getName())) {
                        matchesTag = true;
                        break;
                    }
                }
            }

            // Categories not implemented

            boolean matched = false;
            if (targetGroup.getMatchType() == TargetGroup.MatchType.ANY) {
                matched = matchesProduct || matchesTag;
            } else if (targetGroup.getMatchType() == TargetGroup.MatchType.ALL) {
                matched = (targetGroup.getProducts().isEmpty() || matchesProduct)
                        && (targetGroup.getTags().isEmpty() || matchesTag);
            }

            if (matched) {
                matching.add(productId);
            }
        }

        return matching;
    }

    public static Set<Long> getMatchingProductIdsFrom(Map<Long, Integer> items, TargetGroup targetGroup,
                                                      ProductRepository productRepo, TagRepository tagRepo) {
        Set<Long> matching = new HashSet<>();

        for (Long productId : items.keySet()) {
            boolean matchesProduct = false;
            boolean matchesTag = false;

            if (targetGroup.getProducts() != null && !targetGroup.getProducts().isEmpty()) {
                Optional<Product> productOpt = productRepo.findById(productId);
                if (productOpt.isPresent()) {
                    String productName = productOpt.get().getName();
                    if (targetGroup.getProducts().contains(productName)) {
                        matchesProduct = true;
                    }
                }
            }

            if (targetGroup.getTags() != null && !targetGroup.getTags().isEmpty()) {
                List<Tag> tags = tagRepo.findByProductsId(productId);
                for (Tag t : tags) {
                    if (targetGroup.getTags().contains(t.getName())) {
                        matchesTag = true;
                        break;
                    }
                }
            }

            // Categories not implemented

            boolean matched = false;
            if (targetGroup.getMatchType() == TargetGroup.MatchType.ANY) {
                matched = matchesProduct || matchesTag;
            } else if (targetGroup.getMatchType() == TargetGroup.MatchType.ALL) {
                matched = (targetGroup.getProducts().isEmpty() || matchesProduct)
                        && (targetGroup.getTags().isEmpty() || matchesTag);
            }

            if (matched) {
                matching.add(productId);
            }
        }

        return matching;
    }

    public static int getQuantityForMap(Map<Long, Integer> items, Set<Long> productIds) {
        int total = 0;
        for (Long id : productIds) {
            total += items.getOrDefault(id, 0);
        }
        return total;
    }


    public static int getQuantityFor(OrderContext context, Set<Long> productIds) {
        int total = 0;
        for (Long id : productIds) {
            total += context.orderItems.getOrDefault(id, 0);
        }
        return total;
    }

    public static Set<Long> getMatchingProductIdsByMatchType(OrderContext context, List<TargetGroup> targets, TargetGroup.MatchType matchType,
                                                             ProductRepository productRepo, TagRepository tagRepo) {
        Set<Long> result = new HashSet<>();
        if (matchType == TargetGroup.MatchType.ANY) {
            for (TargetGroup tg : targets) {
                result.addAll(getMatchingProductIds(context, tg, productRepo, tagRepo));
            }
        } else {
            if (!targets.isEmpty()) {
                result.addAll(getMatchingProductIds(context, targets.get(0), productRepo, tagRepo));
                for (int i = 1; i < targets.size(); i++) {
                    result.retainAll(getMatchingProductIds(context, targets.get(i), productRepo, tagRepo));
                }
            }
        }
        return result;
    }

}
