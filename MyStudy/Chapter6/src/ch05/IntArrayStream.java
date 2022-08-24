package ch05;

/*
 * 날짜 : 2022-08-24
 * 이름 : 서정현
 * 내용 : 스트림(Stream)
 */
import java.util.*;
import java.util.stream.*;

public class IntArrayStream {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		
		System.out.println();
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.printf("arr[%d] : %d\n", n-1, n));
		
		long sum = Arrays.stream(arr).sum();
		System.out.println("sum : " + sum);
		System.out.println();
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Stream<Integer> intStream = list.stream();
		int sum2 = intStream.mapToInt(n -> n.intValue()).sum();
		System.out.println(sum2);
		
	}
}
