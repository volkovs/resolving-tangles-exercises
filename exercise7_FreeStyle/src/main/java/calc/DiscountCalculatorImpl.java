package calc;

import java.math.BigDecimal;

import api.DiscountCalculator;
import order.Order;

public class DiscountCalculatorImpl implements DiscountCalculator {

	public BigDecimal calculatreDiscount(Order order) {
		return BigDecimal.ONE.divide(BigDecimal.TEN);
	}
	
}
