package ch04;

/*
 * 날짜 : 2022-08-24
 * 이름 : 서정현
 * 내용 : 함수를 변수처럼 사용하는 람다식
 */
public class PrintStringTest {
	public static void main(String[] args) {
		String str = "Java";
		
		//인터페이스형 변수에 람다식 대입하기
		PrintString str1 = s -> System.out.println(s + " " + "world");
		str1.showString(str);
		
		//매개변수로 전달하는 람다식
		showMyString(str1);
		
		//반환 값으로 쓰이는 람다식
		PrintString str2 = returnString();
		str2.showString(str);
		
		
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + " " + "월드");
	}

}
