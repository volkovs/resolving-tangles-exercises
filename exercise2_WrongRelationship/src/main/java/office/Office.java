package office;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import employee.Employee;

@Entity
public class Office {
	
	@OneToMany(mappedBy = "office")
	private List<Employee> emploees;
	
	public String getLocation() {
		return "Athlone";
	}

}
