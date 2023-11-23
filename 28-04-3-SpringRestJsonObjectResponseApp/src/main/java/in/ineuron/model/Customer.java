package in.ineuron.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {

	private Integer cno;
	private String cname;
	private Float billAmount;
	private String[] teamNames;
	private List<String> studies;
	private Set<String> phoneNumbers;
	private Map<String, Object> idDetails;
	
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, Object> getIdDetails() {
		return idDetails;
	}

	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}

	

	public List<String> getStudies() {
		return studies;
	}

	public void setStudies(List<String> studies) {
		this.studies = studies;
	}

	public String[] getTeamNames() {
		return teamNames;
	}

	public void setTeamNames(String[] teamNames) {
		this.teamNames = teamNames;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Float billAmount) {
		this.billAmount = billAmount;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
