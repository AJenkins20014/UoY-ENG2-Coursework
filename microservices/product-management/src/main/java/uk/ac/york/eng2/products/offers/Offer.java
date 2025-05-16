package uk.ac.york.eng2.products.offers;

public interface Offer {
    OrderContext apply(OrderContext context);
}
