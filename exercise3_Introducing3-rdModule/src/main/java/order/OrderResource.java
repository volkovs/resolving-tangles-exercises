package order;

import java.math.BigDecimal;

import calc.DiscountCalculator;

public class OrderResource {
	
	private DiscountCalculator discountCalculator;

	public BigDecimal proposeDiscount(Order order) {
		return discountCalculator.calculatreDiscount(order);
	}
	
}
