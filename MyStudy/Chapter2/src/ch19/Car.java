package ch19;

public class Car {
	private static int sirialNum = 10000;
	private int carNum;
	
	public Car() {
		carNum = ++sirialNum;
	}

	public int getCarNum() {
		return carNum;
	}
}
