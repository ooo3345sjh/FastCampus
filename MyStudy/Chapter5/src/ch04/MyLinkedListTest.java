package ch04;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : 연결리스트(LinkedList)를 직접 구현 해보기
 */

public class MyLinkedListTest {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.addElement("0");
		list.addElement("1");
		list.addElement("2");
		list.addElement("3");
		list.addElement("4");
		list.removeElement(2);
		list.insertElement(3, "10");
		
		list.printAll();
		
		list.removeAll();
		list.printAll();
	}

}
