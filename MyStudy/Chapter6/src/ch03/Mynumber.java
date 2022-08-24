package ch03;

/*
 * 날짜 : 2022-08-24
 * 이름 : 서정현
 * 내용 : 함수형 인터페이스와 람다식 구현하여 사용하기
 */
@FunctionalInterface
public interface Mynumber {
	int getMax(int num1, int num2);
}
