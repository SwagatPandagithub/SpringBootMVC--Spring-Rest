package in.ineuron.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
	
	
	private Integer eNo;
	private String eName;
	private String eDesig;
	private Double salary;
	
	public Employee(Integer eNo, String eName, String eDesig, Double salary) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.eDesig = eDesig;
		this.salary = salary;
	}
	
	
	
	
	

}
