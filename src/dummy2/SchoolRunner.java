package dummy2;

public class SchoolRunner {

	public static void main(String[] args) {

		Student std = new Student();
		std.setName("Ibrahim");
		std.setLastname("Kalin");
		std.setId(111);
		std.setLabName("IT Labarotory");;
		std.setDepartmentName("IT Department");
		
		Instructor ins = new Instructor();
		
		ins.setName("Osman");
		ins.setLastname("Kalin");
		ins.setTitle("Java Instructor");
		
		std.setInstructor(ins);
		
		School school = std;
		
		
		School school2 = ins;
		
		
		
		
		
		System.out.println(school.student());
		System.out.println(school2.instructor());
		
		
		
	}

}
