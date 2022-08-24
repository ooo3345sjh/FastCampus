package ch02;

/*
 * 날짜 : 2022-08-23
 * 이름 : 서정현
 * 내용 : 람다식 문법
 */
public class AddTest {
	public static void main(String[] args) {
	
	   Add add1 = (x, y) -> {return x + y;};
	   Add add2 = (x, y) -> x + y;
	   
	   System.out.println(add1.add(2, 3));
	   System.out.println(add2.add(2, 3));
		
	}
}
