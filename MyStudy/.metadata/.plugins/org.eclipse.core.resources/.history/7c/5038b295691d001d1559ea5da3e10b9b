package ch06;

import java.util.*;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerT = new Customer(10001, "Tomas");
		Customer customerJ = new Customer(10002, "James");
		Customer customerE = new GoldCustomer(10003, "Edward");
		Customer customerK = new GoldCustomer(10004, "Kim");
		Customer customerS = new VIPCustomer(10005, "Sujan");
		
		System.out.println(customerT.showCustomerInfo());
		System.out.println(customerJ.showCustomerInfo());
		System.out.println(customerE.showCustomerInfo());
		System.out.println(customerK.showCustomerInfo());
		System.out.println(customerS.showCustomerInfo());
		
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(customerT);
		list.add(customerJ);
		list.add(customerE);
		list.add(customerK);
		list.add(customerS);
		
		int price = 10000;
		
		for(Customer customer : list) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이" + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 남은 보너스 포인트는" + customer.bonusPoint + "입니다.");
			
		}
		
		
	}

}
