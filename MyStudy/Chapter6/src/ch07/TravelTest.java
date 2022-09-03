package ch07;

import java.util.*;

/*
 * 날짜 : 2022/08/25
 * 이름 : 서정현
 * 내용 : 스트림을 활용하여 패키지 여행 비용 계산하기
 */

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerSeo = new TravelCustomer("서정현", 29, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		
		List<TravelCustomer> list = new ArrayList<>();
		list.add(customerSeo);
		list.add(customerHong);
		list.add(customerLee);
		list.add(customerKim);
		
		System.out.println("==========스트림활용방법==========");
		
		System.out.println("1. 고객 명단을 출력하는 로직");
		list.stream().map(c -> c.getName()).forEach(s -> System.out.print(s + " "));
		
		System.out.println("\n\n2.여행의 총 비용을 계산하는 로직");
		System.out.println("총 비용 : " + list.stream().mapToInt( c -> c.getPrice()).sum());
		
		System.out.println("\n3.고객 중 20세 이상인 사람의 이름을 정렬하여 출력");
		list.stream().filter(c -> c.getAge() >= 20).sorted().map(c -> c.getName()).forEach(s -> System.out.print(s + " "));
		
//-------------------------------분리선-----------------------------------------------------------------------------------------------------
		
		System.out.println("\n\n==========일반적인 방법==========");
		
		System.out.println("1. 고객 명단을 출력하는 로직");
		for(TravelCustomer customer : list) {
			System.out.print(customer.getName() + " ");
		}
		
		
		
		System.out.println("\n\n2.여행의 총 비용을 계산하는 로직");
		int sum = 0;
		for(TravelCustomer customer : list) {
			sum += customer.getPrice();
		}
		System.out.println("총 비용 : " + sum);
		
		
		
		System.out.println("\n3.고객 중 20세 이상인 사람의 이름을 정렬하여 출력");
		List<String> cName = new ArrayList<String>();
		
		for(TravelCustomer customer : list) {
			if(customer.getAge() >= 20) {
				cName.add(customer.getName());
			}
		}
		
		cName.sort(Comparator.reverseOrder()); //Customer의 고객의 이름을 역순으로 정렬하는 법
		
		for(String name : cName) {
				System.out.print(name + " ");
		}
		
		
	}

}
