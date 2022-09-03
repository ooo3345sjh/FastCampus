package ch07;

public class TravelCustomer implements Comparable<TravelCustomer> {
	private String name; //이름
	private int age; //나이
	private int price; //가격
	
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "name: " + name + " age: " + age + " price: " + price;
	}

	//클래스에 Comparable을 implements해서 역순으로 정렬되도록 compareTo()메서드를 구현하였다. 
	@Override
	public int compareTo(TravelCustomer s) {
		for(int i=0; i<Math.min(name.length(), s.name.length()); i++) {
			if(name.charAt(i) != s.name.charAt(i)) {
				return (name.charAt(i) - s.name.charAt(i));
			}
		}
		return (name.length() - s.name.length());
	}
}
