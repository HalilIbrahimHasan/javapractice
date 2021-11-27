package dummy4;

public class FamilyResults {

	public static void main(String[] args) {

		ReportCard rp = new ReportCard(9,10,9,7);
		
		Student std = new Student("Osman", "Smart", rp);
		
		
		Parent parent = new Parent("Nihat", "Oz", std.totalScore(), std);
		
		System.out.println(parent);
	}

}
