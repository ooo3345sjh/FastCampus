package ch10;

public class StudentTest {
	
	public static void main(String[] args) {
		
		MyLogger myLogger = MyLogger.getLogger();
		
		String name = null;
		
		try {
			Student student = new Student(name);

		} catch (StudentNameFormatException e) {
			myLogger.warning(e.getMessage());
		}
		
		name = "Edward Jon Kim Test";
		
		try {
			Student student = new Student(name);
			
		} catch (StudentNameFormatException e) {
			myLogger.warning(e.getMessage());
		}
		
		Student student = new Student("James");
		
		System.out.println(student.getStudentName());
		
	}

}
