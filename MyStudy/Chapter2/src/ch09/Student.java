package ch09;

public class Student {
	private int studentID;
	private String name;
	private Subject koreaSubject;
	private Subject mathSubject;
	private int totalScore;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
		koreaSubject = new Subject();
		mathSubject = new Subject();
	}

	public void setKoreaSubject(String title, int score) {
		this.koreaSubject.setTitle(title);
		this.koreaSubject.setScore(score);
	}
	
	public void setMathSubject(String title, int score) {
		this.mathSubject.setTitle(title);
		this.mathSubject.setScore(score);
	}
	
	public void totalScore() {
		totalScore = koreaSubject.getScore() +  mathSubject.getScore();
	}
	
	
	public void showInfo() {
		totalScore();
		System.out.println(name + "학생의 총점은 " + totalScore + "점 입니다." );
	}
	
}
