package order;

import java.math.BigDecimal;

import api.DiscountCalculator;
import calc.DiscountCalculatorImpl;
import user.User;

public class OrderService {
	
	private DiscountCalculator discountCalculator = new DiscountCalculatorImpl();
	
	public BigDecimal proposeDiscount(Order order, User user) {
		BigDecimal initialDicsount = user.getUserStatus().getInitialDiscount();
		return initialDicsount.add(discountCalculator.calculatreDiscount(order));
	}
	
	public void confirm(Order order) {
		// empty implementation
	}
	
	public static void main(String... args) {
		BigDecimal discount = new OrderService().proposeDiscount(new Order(), new User());
		System.out.println(discount);
	}
	
}
