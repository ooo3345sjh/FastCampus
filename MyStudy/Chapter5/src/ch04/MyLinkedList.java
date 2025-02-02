package ch04;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : 연결리스트(LinkedList)를 직접 구현 해보기
 */ 

public class MyLinkedList {
	private MyListNode head;
	int count;

	public MyLinkedList() {
		head = null;
		count = 0;
	}

	public MyListNode addElement(String data) {
		
		if(isEmpty()) {
			head = new MyListNode(data);
			count++;
			return head;
		} 
		
		else {
			MyListNode newNode = null;
			MyListNode temp = head;
			
			for(int i=0; i<count; i++) {
				if(i == count-1) {
					newNode = new MyListNode(data);
					temp.next = newNode;
				}
				temp = temp.next;
			}
			count++;
			return newNode;
		}
	}

	public MyListNode insertElement(int position, String data) {
		MyListNode newNode = new MyListNode(data);
		MyListNode preNode = null;
		MyListNode temp = head;
		
		if(isEmpty()) {
			head = newNode;
		} 
		
		else if(position == 0) 
		{
			temp =  head; 
			head = newNode;
			head.next = temp;
		}
		
		else if(position < 0 || position > count) 
		{
			System.out.println("List의 범위를 벗어났습니다.");
			return null;
		} 
		
		else 
		{
			for(int i=0; i<position; i++) {
				preNode = temp;
				temp = temp.next;
			}
			newNode.next = preNode.next ;
			preNode.next = newNode;
			
		}
		count++;
		return newNode;
	}

	public MyListNode removeElement(int position) {
		MyListNode removeNode = null;
		MyListNode preNode = null;
		MyListNode tempNode = head;
		
		if (isEmpty()) 
		{
			System.out.println("List가 비어있습니다.");
			return null;
		}
		
		else if(position >= count || position < 0) 
		{
			System.out.println("List의 범위를 벗어났습니다.");
			return null;
		}
		
		else if(position == 0) 
		{
			removeNode = tempNode;
			head = tempNode.next;
		}
		
		else 
		{
			for (int i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			removeNode = tempNode; 
			preNode.next = tempNode.next;
		}
		count--;
		return removeNode;
	}

	public String getElement(int position) {
		MyListNode getElement = getNode(position);
		return getElement.getData();
	}

	public MyListNode getNode(int position) {
		MyListNode getNode = null;

		if (isEmpty()) 
		{
			System.out.println("List가 비어있습니다.");
			return null;
		}
		
		else if (position >= count || position < 0) 
		{
			System.out.println("List의 범위를 벗어났습니다.");
			return null;
		} 
		
		else 
		{
			MyListNode node = head;
			for (int i = 0; i < count; i++) {
				if (i == position) {
					getNode = node;
					break;
				}
				node = node.next;
			}
			return getNode;
		}
	}

	public void removeAll() {
		head = null;
		count = 0;

	}

	public int getSize() {
		return count;
	}

	public void printAll() {
		MyListNode node = head;
		
		if(isEmpty()) {
			System.out.println("List가 비어 있습니다.");
			return;
		}
		
		for(int i=0; i<count; i++) {
	
			if(node.next != null) {
				System.out.print(node.getData() + "->");
			} else {
				System.out.println(node.getData());
				return;
			}
			node = node.next;
		}
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
}
