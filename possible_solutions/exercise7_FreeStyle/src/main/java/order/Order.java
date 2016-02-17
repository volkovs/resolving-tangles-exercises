package order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private BigDecimal total = BigDecimal.ZERO;
	
	private List<OrderItem> orderItems = new ArrayList<>();

	public BigDecimal getTotal() {
		return total;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
}
