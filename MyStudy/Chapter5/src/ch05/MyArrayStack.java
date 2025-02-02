package ch05;

/*
 * 날짜 : 2022-08-19
 * 이름 : 서정현
 * 내용 : 내가 구현한 ArrayList로 Stack 직접 구현 해보기
 */
import ch03.*;

public class MyArrayStack {
	
	private MyArray array;
	private int top;
	
	public MyArrayStack() {
		array = new MyArray();
	}
	
	public MyArrayStack(int size) {
		array = new MyArray(size);
	}
	
	public void push(int num) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		
		top++;
		array.addElement(num);
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return MyArray.ERROR_NUM;
		}
		
		int popElement = array.removeElement(--top);
		return popElement;
	}
	
	public int Peek() {
		int peekElement = array.getElement(top-1);
		return peekElement;
	}
	
	public int getSize() {
		return top;
	}
	
	public boolean isFull() {
		if(top == array.getSize()){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(top == 0){
			return true;
		} else {
			return false;
		}
		
	}
	
	public void printAll() {
		array.printAll();
	}
	
	

}
