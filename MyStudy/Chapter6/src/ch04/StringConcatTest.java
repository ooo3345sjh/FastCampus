package ch04;

/*
 * 날짜 : 2022-08-24
 * 이름 : 서정현
 * 내용 : 객체지향 프로그래밍 vs. 람다식 구현
 */
public class StringConcatTest {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "world";
		
		//인터페이스를 구현한 클래스를 생성하고 메서드 호출하기
		StringConcat strImpl = new StringConcatImpl();
		
		strImpl.makeString(s1, s2);
		
		//람다식으로 구현  
		StringConcat concat1 = (a, b) -> System.out.println(a + " " + b);
		concat1.makeString(s1, s2);
		
		//자바에서는 객체 없이 메서드가 호출 될 수 없음
		//람다식이 클래스 없이 실행되는 것은, 
		//람다식 내부에는 익명 클래스가 사용되기 때문이다.
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		
		concat2.makeString(s1, s2);
		
	}
}
