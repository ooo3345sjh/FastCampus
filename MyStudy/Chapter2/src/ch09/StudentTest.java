package ch09;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(12345,"Lee");
		studentLee.setKoreaSubject("Korea", 90);
		studentLee.setMathSubject("Math", 70);
		studentLee.showInfo();
	}

}
