package dummy2;

public class Instructor implements ITDepartment{
	
	String name;
	String lastname;
	String title;
	String departmentName;
	String labName;
	
	
	
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return departmentName;
	}
	@Override
	public Instructor instructor() {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public String instructorTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	@Override
	public String labName() {
		// TODO Auto-generated method stub
		return labName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public boolean isLabAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Student student() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", lastname=" + lastname + ", title=" + title + ", departmentName="
				+ departmentName + ", labName=" + labName + "]";
	}
	
	

}
