
package uk.ac.york.eng2.products.offers;

import uk.ac.york.eng2.products.offers.conditions.*;
import uk.ac.york.eng2.products.offers.actions.*;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.List;
import java.time.LocalDate;

public class ChristmasDaySale implements Offer {

	private final OfferExecutor offerExecutor;
	private final ProductRepository productRepository;
	private final TagRepository tagRepository;

	private LocalDate lastResetDate = LocalDate.now();
	private int usesToday;

	public ChristmasDaySale(OfferExecutor offerExecutor, ProductRepository productRepository, TagRepository tagRepository) {
		this.offerExecutor = offerExecutor;
		this.productRepository = productRepository;
		this.tagRepository = tagRepository;
	}

	@Override
	public OrderContext apply(OrderContext context) {

		// Reset daily offer uses
		resetCounter(context);

		// Check daily uses
		Integer maxUses = null;
		boolean withinDailyUses = true;
		if (maxUses != null && maxUses > 0 && usesToday >= maxUses) {
			withinDailyUses = false;
		}

		// Check conditions
		int highestMatches = 0;
		int matches = 0;
		boolean conditionsMet = withinDailyUses;
		if(withinDailyUses){

			matches = OnDateCondition.isValid(context, new Date(LocalDate.now().getYear(), 12, 25), new Date(LocalDate.now().getYear(), 12, 25));

			if (matches < 1) conditionsMet = false;
			if (matches > highestMatches) highestMatches = matches;

			matches = OrderTotalCondition.isValid(
			context, 60.0, 0);

			if (matches < 1) conditionsMet = false;
			if (matches > highestMatches) highestMatches = matches;
		}

		if (conditionsMet){

			context = PercentageDiscountAction.apply(context, 10.0, 0, true, List.of(), TargetGroup.MatchType.ANY, productRepository,
			tagRepository);

			usesToday++;
		}

		Offer next = null;
		if (conditionsMet) {
		} else {
			next = offerExecutor.getOffer("Chocolate Cake Sale");
		}

		if (next != null) {
			return next.apply(context);
		}

		return context;
	}

	private void resetCounter(OrderContext context){
		if (!context.orderDate.isEqual(lastResetDate)) {
			usesToday = 0;
			lastResetDate = context.orderDate;
		}
	}
}