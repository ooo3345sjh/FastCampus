package ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(54321, "kim", 2);
		System.out.println(studentKim.showStudentInfo());
		
	}

}
