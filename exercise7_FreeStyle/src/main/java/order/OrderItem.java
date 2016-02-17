package order;

import item.Item;

public class OrderItem {
	
	private int count = 1;
	
	private Item item;

	private Order order;

	public int getCount() {
		return count;
	}

	public Item getItem() {
		return item;
	}

	public Order getOrder() {
		return order;
	}
	
}
