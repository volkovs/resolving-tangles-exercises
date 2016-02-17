package order;

import java.math.BigDecimal;

import com.google.inject.Inject;

public class OrderService {
	
	@Inject
	private DiscountCalculator discountCalculator;

	public BigDecimal proposeDiscount(Order order) {
		return discountCalculator.calculatreDiscount(order);
	}
	
}
