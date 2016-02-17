package calc;

import java.math.BigDecimal;

import order.Order;

public class DiscountCalculator {

	public BigDecimal calculateDiscount(Order order) {
		return BigDecimal.ONE.subtract(new BigDecimal(1000).subtract(order.getTotal()).divide(order.getTotal()));
	}
	
}
