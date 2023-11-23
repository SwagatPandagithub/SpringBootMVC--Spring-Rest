package in.ineuron.model;

public class Employee {
	
	private String name="swagat";
	private String designation;
	private Integer saslary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getSaslary() {
		return saslary;
	}
	public void setSaslary(Integer saslary) {
		this.saslary = saslary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", saslary=" + saslary + "]";
	}
	
	
	public Employee(String name, String designation, Integer saslary) {
		super();
		this.name = name;
		this.designation = designation;
		this.saslary = saslary;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
