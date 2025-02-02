package ch06;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : 내가 구현한 연결리스트(LinkedList)로 Queue를 구현 해보기
 */ 

import ch04.*;

interface iQueue {
	public void enQueue(String data);
	public String deQueue();
	public void printAll();
}

public class MyListQueue extends MyLinkedList implements iQueue{
	
	private MyListNode front;
	private MyListNode rear;
	
	public MyListQueue() {
		front = null;
		rear = null;
	}
	
	public MyListNode getRear() {
		return rear;
	}

	public MyListNode getFront() {
		return front;
	}

	@Override
	public void enQueue(String data) {
		MyListNode newNode = null;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		} else {
			newNode = addElement(data);
			rear = newNode;
		}
	}
	
	@Override
	public String deQueue() {
		if(isEmpty()) 
		{
			System.out.println("Queue is empty");
			return null;
		} 
		
		else 
		{
			String data = front.getData();
			front = removeElement(0);
			front = front.next;
			if(front == null) { //삭제한 항목이 마지막 항목인 경우 
				rear = null;
			}
			return data;
		}
	}
}
