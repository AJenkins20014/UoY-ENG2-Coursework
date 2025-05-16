package uk.ac.york.eng2.products.offers;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

@Singleton
public class OfferExecutor {

	private final ProductRepository productRepository;

	private final TagRepository tagRepository;

	private final java.util.Map<String, Offer> offers = new java.util.HashMap<>();

	@Inject
	public OfferExecutor(ProductRepository productRepository, TagRepository tagRepository){
		this.productRepository = productRepository;
		this.tagRepository = tagRepository;

		// build every offer rule in the model
		offers.put("Bakewell Tart Sale", new BakewellTartSale(this, productRepository, tagRepository));
		offers.put("Large Pizza Bundle", new LargePizzaBundle(this, productRepository, tagRepository));
		offers.put("TwoForOne Pizza Deal", new TwoForOnePizzaDeal(this, productRepository, tagRepository));
		offers.put("Christmas Day Sale", new ChristmasDaySale(this, productRepository, tagRepository));
		offers.put("Chocolate Cake Sale", new ChocolateCakeSale(this, productRepository, tagRepository));
	}

	public OrderContext applyOffers(OrderContext context) {
		OrderContext offersApplied = new OrderContext(context.orderItems, context.itemPrices, context.totalPrice, context.orderDate);

		Offer initial = offers.get("Bakewell Tart Sale");

		return initial.apply(context);
	}

	public Offer getOffer(String name) {
		return offers.get(name);
	}
}