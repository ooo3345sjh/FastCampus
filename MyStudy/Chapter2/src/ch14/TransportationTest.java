package ch14;


public class TransportationTest {

	public static void main(String[] args) {
		Person personJ = new Person("James", 4000);
		Person personT = new Person("Tomas", 8800);
		Person personS = new Person("Seo", 10000);
		
		Bus bus100 = new Bus(100);
		Subway subway2 = new Subway(2);
		
		personJ.remainingMoney();
		personT.remainingMoney();
		personS.remainingMoney();
		
		personJ.takeBus(bus100);
		personT.takeSubway(subway2);
		personS.takeSubway(subway2);
		
		System.out.println();
		
		bus100.showInfo();
		subway2.showInfo();
		
		System.out.println();
		
		personJ.remainingMoney();
		personT.remainingMoney();
		personS.remainingMoney();
		
	}

}
