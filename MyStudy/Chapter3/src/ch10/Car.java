package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void starCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} //구현 내용이 없는 메서드(추상 메서드가 아님) - 훅메서드
	
	final public void run() {
		starCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
