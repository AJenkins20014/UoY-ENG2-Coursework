package uk.ac.york.eng2.products.offers;

import java.util.List;

public class TargetGroup {
    public MatchType matchType;
    public List<String> products;
    public List<String> tags;
    public List<String> categories;

    public enum MatchType {
        ALL,
        ANY
    }

    public TargetGroup(List<String> products, List<String> tags, List<String> categories, MatchType matchType) {
        this.products = products;
        this.tags = tags;
        this.categories = categories;
        this.matchType = matchType;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
}
