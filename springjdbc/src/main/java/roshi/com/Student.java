package roshi.com;

public class Student {
	private  int id ;
	private String name;
	private String cmp;
	
	public Student() {
		
	}
	public Student(int id, String name, String cmp) {
	
		this.id = id;
		this.name = name;
		this.cmp = cmp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	
	
}
