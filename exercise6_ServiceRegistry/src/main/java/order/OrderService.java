package order;

import java.math.BigDecimal;

import calc.DiscountCalculatorImpl;

public class OrderService {
	
	private DiscountCalculator discountCalculator = new DiscountCalculatorImpl();

	public BigDecimal proposeDiscount(Order order) {
		return discountCalculator.calculatreDiscount(order);
	}
	
	public static void main(String... args) {
		BigDecimal discount = new OrderService().proposeDiscount(new Order());
		System.out.println(discount);
	}
	
}
