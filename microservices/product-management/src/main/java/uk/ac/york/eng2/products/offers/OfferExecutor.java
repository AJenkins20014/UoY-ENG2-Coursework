package uk.ac.york.eng2.products.offers;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

@Singleton
public class OfferExecutor {

	@Inject
	ProductRepository productRepository;

	@Inject
	TagRepository tagRepository;

	private final java.util.Map<String, Offer> offers = new java.util.HashMap<>();

	public OfferExecutor(){

		// build every offer rule in the model
		offers.put("Bakewell Tart Sale", new BakewellTartSale(productRepository, tagRepository));
		offers.put("Large Pizza Bundle", new LargePizzaBundle(productRepository, tagRepository));
		offers.put("TwoForOne Pizza Deal", new TwoForOnePizzaDeal(productRepository, tagRepository));
		offers.put("Christmas Day Sale", new ChristmasDaySale(productRepository, tagRepository));
		offers.put("Chocolate Cake Sale", new ChocolateCakeSale(productRepository, tagRepository));
	}

	public OrderContext applyOffers(OrderContext context) {
		OrderContext offersApplied = new OrderContext(context.orderItems, context.itemPrices, context.totalPrice, context.orderDate);

		Offer initial = offers.get("Bakewell Tart Sale");

		return initial.apply(context);
	}
}