package item;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Item {
	
	@Basic
	private String name;
	
	@Basic
	private String description;
	
	@Basic
	private BigDecimal price;

}
