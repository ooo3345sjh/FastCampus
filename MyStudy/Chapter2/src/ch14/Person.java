package ch14;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		
		this.money -= 1000;
		bus.take();
	}
	
	public void takeSubway(Subway subway) {
		
		this.money -= 1200;
		subway.take();
	}
	
	public void remainingMoney() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}
	
}
