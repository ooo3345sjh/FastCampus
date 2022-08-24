package ch05;

import java.util.*;
import java.util.stream.*;

/*
 * 날짜 : 2022-08-24
 * 이름 : 서정현
 * 내용 : 스트림(Stream)
 */
public class ArrayListStreamTest {
	
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s));
		System.out.println();
		sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
		System.out.println();
		sList.stream().map(s -> s.length()).forEach(s -> System.out.println(s));
	}
}
