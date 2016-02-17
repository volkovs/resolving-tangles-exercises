package employee;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import office.Office;

@Entity
public class Employee {
	
	@Basic
	private String signum;

	@ManyToOne
	private Office office;
	
	public String getLocation() {
		return String.format("%s: %s", office.getLocation(), signum); 
	}
	
}
