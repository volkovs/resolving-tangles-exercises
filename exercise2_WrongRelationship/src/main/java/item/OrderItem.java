package item;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import order.Order;

@Entity
public class OrderItem {
	
	@Basic
	private int count = 1;
	
	@ManyToOne
	private Item item;

	@ManyToOne
	private Order order;
	
	
	
}
