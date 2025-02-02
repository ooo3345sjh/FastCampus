package ch13;

import java.util.*;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : Comparator의 활용
 * 		 - 이미 Comparable이 구현된 경우 Comparator로 비교하는 방식을 
 * 		 - 다시 구현할 수 있음
 * 		 - String 클래스의 경우 오름차순으로 구현되어 있는데 Comparator를 이용하여 내림차순으로 
 *		 - 재구성할 수 있다.
 */
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return (s1.compareTo(s2)) * -1;
	}
	
}


public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("E");
		treeSet.add("S");
		treeSet.add("D");
		treeSet.add("G");
		
		Iterator<String> i = treeSet.iterator();
		while(i.hasNext()) {
			 System.out.println(i.next());
		}
	}
}
