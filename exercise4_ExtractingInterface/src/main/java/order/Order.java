package order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Order {
	
	@Basic
	private BigDecimal total;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItems = new ArrayList<>();

	public BigDecimal getTotal() {
		return total;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
}
