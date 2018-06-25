package csv_to_tdf;

public class Student {

	//STUDENT variables
	private int id;
	private String name, school;
	
	//CONSTRUCTOR
	public Student(int id, String name, String school) {
		this.setId(id);
		this.setName(name);
		this.setSchool(school);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		String str = getId() + "\t" + getName() + "\t" + getSchool();
		return str;
	}

}
