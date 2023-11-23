package in.ineuron.model;

public class Company {
	
	private Integer companyId;
	private String cName;
	private String cAddress;
	private String cSize;
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcSize() {
		return cSize;
	}
	public void setcSize(String cSize) {
		this.cSize = cSize;
	}
	public Company(Integer companyId, String cName, String cAddress, String cSize) {
		super();
		this.companyId = companyId;
		this.cName = cName;
		this.cAddress = cAddress;
		this.cSize = cSize;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
