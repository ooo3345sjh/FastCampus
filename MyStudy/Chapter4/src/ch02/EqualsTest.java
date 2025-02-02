package ch02;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student stu1 = new Student(100, "Lee");
		Student stu2 = new Student(100, "Lee");
		
		System.out.println(stu1 == stu2);
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		
		System.out.println(System.identityHashCode(stu1));
		System.out.println(System.identityHashCode(stu2));
		Student stu3 = (Student)stu1.clone();
		
		stu1.setStudentName("kim");
		System.out.println(stu3.getStudentName());
		System.out.println(stu1.getStudentName());
	}
}
