package dummy2;

import java.util.List;

public interface ITDepartment extends School{
	
	public static final String departmentName = "IT Department";
	
	
	public Instructor instructor();
	
	
	public abstract String instructorTitle();
	
	
	public String labName();
	
	public boolean isLabAvailable();
	
	public Student student();
}
