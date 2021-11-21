package dummy2;

import java.util.List;

public interface LanguageDepartment extends School {

	public static final String departmentName = "Language Department";

	public Instructor instructor();

	public abstract String instructorTitle();

	public String labName();

	public boolean isLabAvailable();

	public Student student();

}
