package ch14;

public class Bus {
	private int busID;
	private int earnings;
	private int numberOfPassengers;
	
	public Bus(int busID) {
		this.busID = busID;
	}
	
	public void take() {
		earnings += 1000;
		numberOfPassengers++;
	}
	
	public void showInfo() {
		System.out.println(busID + "번 버스의 승객은 " + numberOfPassengers + "명 이고, 수입은 " + earnings + "원 입니다.");
	}
	
	
}
