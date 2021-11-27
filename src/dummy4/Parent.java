package dummy4;

public class Parent implements HonorAward{

	
	String name;
	String lastname;
	boolean studentHonor;
	Student student;
	
	public Parent() {
	}
	
	public Parent(String name, String lastname, boolean studentHonor, Student student) {
		this.name = name;
		this.lastname = lastname;
		this.studentHonor = studentHonor;
		this.student = student;
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
	public boolean isStudentHonor() {
		return studentHonor;
	}
	public void setStudentHonor(boolean studentHonor) {
		this.studentHonor = studentHonor;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String successMessage() {
		return student.reportCard.successMessage();
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", lastname=" + lastname + ", studentHonor=" + studentHonor + ", student="
				+ student + "]";
	}

	
	
	
	
	
	
	
}
