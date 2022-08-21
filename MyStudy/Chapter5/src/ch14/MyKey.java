package ch14;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 쌍(pair)으로 자료를 관리하는 Map 인터페이스를 구현한 클래스와 그 활용
 * 		 - TreeMap 클래스
 */
import java.util.*;

public class MyKey implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {
		return (I1.compareTo(I2)) * -1;
	}

}
