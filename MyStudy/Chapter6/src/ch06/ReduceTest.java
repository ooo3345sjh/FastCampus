package ch06;

/*
 * 날짜 : 2022-08-25
 * 이름 : 서정현
 * 내용 : 연산 수행에 대한 구현을 할 수 있는 reduce()연산
 */

import java.util.*;
import java.util.function.*;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length > s2.getBytes().length) {
			return s1;
		} else {
			return s2;
		}
	}
	
}



public class ReduceTest {

	public static void main(String[] args) {
		
		String greetings[] = {"안녕하세요~~~", "Hello", "Good morning", "반가워용"};
		
		String str1 = Arrays.stream(greetings).reduce("", (s1, s2) -> {
		
			if(s1.getBytes().length > s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
			});
		
		System.out.println(str1);
		System.out.println();
		
		////BinaryOperator를 구현한 클래스 이용
		String o =  Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(o);
		
	}

}
