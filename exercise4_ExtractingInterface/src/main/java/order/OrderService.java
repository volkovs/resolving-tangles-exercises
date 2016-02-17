package order;

import java.math.BigDecimal;

import calc.DiscountCalculator;

public class OrderService {
	
	private DiscountCalculator discountCalculator;

	public BigDecimal proposeDiscount(Order order) {
		return discountCalculator.calculateDiscount(order);
	}
	
}
