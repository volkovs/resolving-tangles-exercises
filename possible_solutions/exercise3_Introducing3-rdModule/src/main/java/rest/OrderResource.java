package rest;

import java.math.BigDecimal;

import calc.DiscountCalculator;
import order.Order;

public class OrderResource {
	
	private DiscountCalculator discountCalculator;

	public BigDecimal proposeDiscount(Order order) {
		return discountCalculator.calculatreDiscount(order);
	}
	
}
