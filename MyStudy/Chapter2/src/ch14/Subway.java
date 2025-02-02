package ch14;

public class Subway {
	private int subwayID;
	private int earnings;
	private int numberOfPassengers;
	
	public Subway(int subwayID) {
		this.subwayID = subwayID;
	}
	
	public void take() {
		earnings += 1200;
		numberOfPassengers++;
	}
	
	public void showInfo() {
		System.out.println(subwayID + "번 지하철의 승객은 " + numberOfPassengers + "명 이고, 수입은 " + earnings + "원 입니다.");
	}
	
}
