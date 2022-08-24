package ch04;

/*
 * 날짜 : 2022-08-24
 * 이름 : 서정현
 * 내용 : 객체지향 프로그래밍 vs. 람다식 구현
 */
public class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}

}
