package order;

import java.math.BigDecimal;

public class OrderService {
	
	private DiscountCalculater discountCalculator;

	public BigDecimal proposeDiscount(Order order) {
		return discountCalculator.calculateDiscount(order);
	}
	
}
