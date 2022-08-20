package ch06;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : 내가 구현한 연결리스트(LinkedList)로 Queue를 구현 해보기
 */ 

public class MyListQueueTest {

	public static void main(String[] args) {
		MyListQueue mlq = new MyListQueue();
		mlq.enQueue("A");
		mlq.enQueue("B");
		mlq.enQueue("C");
		mlq.enQueue("D");
		
		mlq.printAll();
		
		
		System.out.println(mlq.deQueue());
		System.out.println(mlq.deQueue());
	}
	

}
