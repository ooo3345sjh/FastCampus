package ch08;

public class Person {

	public String name;
	public int age;
	public String gender;
	public int height;
	public int weight;
	
	
	
	public Person() {}
	
	public Person(String name, int age, String gender, int height, int weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	public String showStudentInfo() {
		return "키가 " + height + "이고 몸무게가 " + weight + "킬로인 " + 
				gender + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.";	
		}
}
