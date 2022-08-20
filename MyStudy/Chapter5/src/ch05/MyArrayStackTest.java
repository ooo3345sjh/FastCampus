package ch05;

/*
 * 날짜 : 2022-08-19
 * 이름 : 서정현
 * 내용 : 내가 구현한 ArrayList로 Stack 직접 구현 해보기
 */

public class MyArrayStackTest {
	public static void main(String[] args) {
		MyArrayStack mas = new MyArrayStack(5);
		mas.push(0);
		mas.push(1);
		mas.push(2);
		mas.push(3);
		mas.push(4);
		System.out.println(mas.isFull());
		System.out.println(mas.getSize());
		mas.printAll();
	}

}
