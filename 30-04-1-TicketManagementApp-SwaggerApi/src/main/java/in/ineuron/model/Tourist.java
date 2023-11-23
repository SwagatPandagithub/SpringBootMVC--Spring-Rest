package in.ineuron.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
public class Tourist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private String packageType;
	private double budget;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", packageType=" + packageType + ", budget=" + budget + "]";
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tourist(Integer id, String name, String packageType, double budget) {
		super();
		this.id = id;
		this.name = name;
		this.packageType = packageType;
		this.budget = budget;
	}
	
	

}
