package dummy2;

public class SchoolRunner {

	public static void main(String[] args) {

		Student std = new Student();
		std.setName("Ibrahim");
		std.setLastname("Kalin");
		std.setId(111);
		std.setLabName("IT Labarotory");;
		std.setDepartmentName(ITDepartment.departmentName);
		
		Instructor ins = new Instructor();
		
		ins.setName("Osman");
		ins.setLastname("Kalin");
		ins.setTitle("Java Instructor");
		
		std.setInstructor(ins);
		
		ITDepartment dep = std;
		
		
		ITDepartment dep2 = ins;
		
		
		School school = dep;
		
		
//		System.out.println(dep.student());
//		System.out.println(dep2.instructor());
		System.out.println(school);
		
//		System.out.println(school.departmentName());
	}

}
