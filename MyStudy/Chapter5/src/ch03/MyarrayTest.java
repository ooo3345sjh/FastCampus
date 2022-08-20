package ch03;

/*
 * 날짜 : 2022-08-19
 * 이름 : 서정현
 * 내용 : ArrayList를 직접 구현 해보기
 */

public class MyarrayTest {

	public static void main(String[] args) {
		MyArray mArr = new MyArray(5);
		mArr.addElement(1);
		mArr.addElement(2);
		mArr.addElement(3);
		mArr.addElement(4);
		mArr.insertElement(4, 5);
		mArr.removeElement(0);
		mArr.printAll();
		
		System.out.println();
		System.out.println(mArr.getSize());
		
	}

}
