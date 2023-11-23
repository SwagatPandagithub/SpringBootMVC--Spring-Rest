package in.ineuron.model;

public class Actor {
	
	private Integer aId;
	private String name;
	private Float age;
	private String type;
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getAge() {
		return age;
	}
	public void setAge(Float age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Actor(Integer aId, String name, Float age, String type) {
		super();
		this.aId = aId;
		this.name = name;
		this.age = age;
		this.type = type;
	}
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Actor [aId=" + aId + ", name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	
	

}
