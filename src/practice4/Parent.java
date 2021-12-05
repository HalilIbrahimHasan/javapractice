package practice4;

import java.util.*;

public class Parent implements HonorAward{
	
	
	private String name;
	private String lastname;
	private boolean honorStudent;
	private Student student;
	
	private List<Product> products = new ArrayList<>();
	private Requirement requirement;
	
	
	public List<Product> getProducts() {
		return products;
	}




	public void setProducts(List<Product> products) {
		this.products = products;
	}




	public Requirement getRequirement() {
		return requirement;
	}




	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}




	public static void setBudget(double budget) {
		Parent.budget = budget;
	}




	private static double budget = 30000;
	

	
	
	public static double getBudget() {
		return budget;
	}




	public static void buyProduct(double budget) {
		Parent.budget -= budget;
	}




	public Parent() {
	}




	public Parent(String name, String lastname, boolean honorStudent, Student student) {
		
		this.name = name;
		this.lastname = lastname;
		this.honorStudent = honorStudent;
		this.student = student;
	}

	


	@Override
	public String successMessage() {
		
		String message = "Please spend more time with "+student.getName();
		
		if(student.total() >= 35) {
			message ="Congratulations! You have an amazing child who honors everyone!";
		}
		
		return message;
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




	public boolean isHonorStudent() {
		return honorStudent;
	}




	public void setHonorStudent(boolean honorStudent) {
		this.honorStudent = honorStudent;
	}




	public Student getStudent() {
		return student;
	}




	public void setStudent(Student student) {
		this.student = student;
	}




	@Override
	public String toString() {
		return "Parent [name=" + name + ", lastname=" + lastname + ", honorStudent=" + honorStudent + ", student="
				+ student + "]";
	}
	
	
	
	
	

}
