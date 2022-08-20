package ch04;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : 연결리스트(LinkedList)를 직접 구현 해보기
 */

public class MyListNode {
	private String data;       // 자료
	public MyListNode next;    // 다음 노드를 가리키는 링크
	
	public MyListNode(){
		data = null;
		next = null;
	}
	
	public MyListNode(String data){
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link){
		this.data = data;
		this.next = link;
	}
	
	public String getData(){
		return data;
	}
}
