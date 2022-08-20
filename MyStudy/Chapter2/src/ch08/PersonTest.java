package ch08;

public class PersonTest {

	public static void main(String[] args) {
		Person tomas = new Person();
		System.out.println(tomas.showStudentInfo());
		
		Person kim = new Person("kim", 24, "남성", 180, 60);
		System.out.println(kim.showStudentInfo());
		
		
	}

}
