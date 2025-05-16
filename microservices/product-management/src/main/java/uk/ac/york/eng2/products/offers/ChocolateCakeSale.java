
package uk.ac.york.eng2.products.offers;

import uk.ac.york.eng2.products.offers.conditions.*;
import uk.ac.york.eng2.products.offers.actions.*;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.List;
import java.time.LocalDate;

public class ChocolateCakeSale implements Offer {

	private final ProductRepository productRepository;
	private final TagRepository tagRepository;

	private LocalDate lastResetDate = LocalDate.now();
	private int usesToday;

	public ChocolateCakeSale(ProductRepository productRepository, TagRepository tagRepository) {
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
		if(withinDailyUses){

			matches = RequiresTargetCondition.isValid(
			context,
			List.of(new TargetGroup(List.of(), List.of("cake", "chocolate"), List.of(), TargetGroup.MatchType.ALL)), TargetGroup.MatchType.ALL, 1, 0, productRepository,
			tagRepository);

			if (matches > highestMatches) highestMatches = matches;

			matches = OrderTotalCondition.isValid(
			context, 50.0, 0);

			if (matches > highestMatches) highestMatches = matches;
		}
		boolean conditionsMet = highestMatches > 0;

		if (conditionsMet){

			context = FlatDiscountAction.apply(context, 5.0);

			usesToday++;
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