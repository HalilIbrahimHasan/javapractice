package dummy4;

public class Student {

	String name;
	String lastname;
	ReportCard reportCard;
	
	public Student() {
	}
	public Student(String name, String lastname, ReportCard reportCard) {
		this.name = name;
		this.lastname = lastname;
		this.reportCard = reportCard;
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
	public ReportCard getReportCard() {
		return reportCard;
	}
	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}
	
	public boolean totalScore() {
		int total = reportCard.EnglishGrade + reportCard.ictGrade + reportCard.javaGrade + reportCard.mathGrade;
		return total >= 35;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", reportCard=" + reportCard + "]";
	}
	
	
	
	
	
}
