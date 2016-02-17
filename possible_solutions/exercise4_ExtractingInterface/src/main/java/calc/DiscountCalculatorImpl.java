package calc;

import order.DiscountCalculater;
import order.Order;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DiscountCalculatorImpl implements DiscountCalculater {

	@Override
	public BigDecimal calculateDiscount(Order order) {
		return BigDecimal.ONE.subtract(new BigDecimal(1000).subtract(order.getTotal()).divide(order.getTotal(), RoundingMode.HALF_UP));
	}
	
}
