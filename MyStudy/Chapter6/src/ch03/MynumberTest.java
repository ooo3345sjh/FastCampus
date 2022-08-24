package ch03;

/*
 * 날짜 : 2022-08-24
 * 이름 : 서정현
 * 내용 : 함수형 인터페이스와 람다식 구현하여 사용하기
 */
public class MynumberTest {
	public static void main(String[] args) {
		
		Mynumber mynumber = (x, y) -> x > y ? x : y;
		
		System.out.println(mynumber.getMax(10, 20));
	}

}
