package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentLee.studentID = 54321;
		studentLee.setStudentName("Kim");
		studentLee.address = "경기도 성남시";
		
		studentLee.showStudentInfo();
		
	}

}
