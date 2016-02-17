package order;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class OrderItem {
	
	@Basic
	private int count = 1;

	@ManyToOne
	private Order order;
	
}
