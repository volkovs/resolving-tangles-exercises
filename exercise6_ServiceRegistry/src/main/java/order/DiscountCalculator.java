package order;

import java.math.BigDecimal;

import order.Order;

public interface DiscountCalculator {

	BigDecimal calculatreDiscount(Order order);
	
}
