package dummy2;

import java.util.List;

public class Student implements ITDepartment, LanguageDepartment {
	
	
	


	String name;
	String lastname;
	int id;
	String departmentName;
	Instructor instructor;
	String labName;
	
	
	
	
	
	
	
	
	@Override
	public String departmentName() {
		return departmentName;
	}
	@Override
	public Instructor instructor() {
		return instructor;
	}
	@Override
	public String instructorTitle() {
		return instructor.getName();
	}
	@Override
	public String labName() {
		return labName;
	}
	@Override
	public boolean isLabAvailable() {
		return false;
	}
	@Override
	public Student student() {
		return this;
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
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setLabName(String labName) {
		this.labName = labName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", id=" + id + ", departmentName=" + departmentName
				+ ", instructor=" + instructor + ", labName=" + labName + "]";
	}
	
	

}
