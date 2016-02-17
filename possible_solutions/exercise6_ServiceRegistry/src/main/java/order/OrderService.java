package order;

import java.math.BigDecimal;
import java.util.ServiceLoader;

public class OrderService {
	
	private DiscountCalculator discountCalculator;
	
	public OrderService() {
		discountCalculator = ServiceLoader.load(DiscountCalculator.class).iterator().next();
	}

	public BigDecimal proposeDiscount(Order order) {
		return discountCalculator.calculatreDiscount(order);
	}
	
	public static void main(String... args) {
		BigDecimal discount = new OrderService().proposeDiscount(new Order());
		System.out.println(discount);
	}
	
}
