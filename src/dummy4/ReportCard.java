package dummy4;

public class ReportCard implements HonorAward {

	int mathGrade;
	int EnglishGrade;
	int ictGrade;
	int javaGrade;

	public ReportCard() {

	}

	public ReportCard(int mathGrade, int englishGrade, int ictGrade, int javaGrade) {
		this.mathGrade = mathGrade;
		EnglishGrade = englishGrade;
		this.ictGrade = ictGrade;
		this.javaGrade = javaGrade;
	}

	public int getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}

	public int getEnglishGrade() {
		return EnglishGrade;
	}

	public void setEnglishGrade(int englishGrade) {
		EnglishGrade = englishGrade;
	}

	public int getIctGrade() {
		return ictGrade;
	}

	public void setIctGrade(int ictGrade) {
		this.ictGrade = ictGrade;
	}

	public int getJavaGrade() {
		return javaGrade;
	}

	public void setJavaGrade(int javaGrade) {
		this.javaGrade = javaGrade;
	}

	@Override
	public String successMessage() {
		
		int totalScore = mathGrade + EnglishGrade + ictGrade + javaGrade;
		String message = "you need to make more efforts!";
		if(totalScore >= 35) {
			message = "Congratulations for your amazing score! Keep it up!";
		}
		
		
		
		return message;
	}

	@Override
	public String toString() {
		return "ReportCard [mathGrade=" + mathGrade + ", EnglishGrade=" + EnglishGrade + ", ictGrade=" + ictGrade
				+ ", javaGrade=" + javaGrade + "]";
	}

}
