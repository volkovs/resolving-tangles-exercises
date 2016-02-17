package order;

import java.math.BigDecimal;

public interface DiscountCalculater {

	BigDecimal calculateDiscount(Order order);

}