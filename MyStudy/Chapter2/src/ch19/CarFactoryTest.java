package ch19;

import java.util.*;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getInstance();
		
		Car mySonata = carFactory.createCar();
		Car yourSonata = carFactory.createCar();
		Car Sonata = carFactory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		
		
		
	}

}
