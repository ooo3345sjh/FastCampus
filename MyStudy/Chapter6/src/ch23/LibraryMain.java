package ch23;

import java.nio.file.*;
import java.util.*;

/*
 * 날짜 : 2022/09/08
 * 이름 : 서정현
 * 내용 : wait()/notify() 에서드를 활용한 동기화 프로그래밍
 * 
 *	- 리소스가 어떤 조건에서 더 이상 유효하지 않은 경우 리소스를 기다리기 위해 Thread 가 wait() 상태가 된다.
 *	- wait() 상태가 된 Thread은 notify() 가 호출 될 때까지 기다린다.
 *	- 유효한 자원이 생기면 notify()가 호출되고 wait() 하고 있는 Thread 중 무작위로 하나의 Thread를 재시작 하도록 한다.
 *	- notifyAll()이 호출되는 경우 wait() 하고 있는 모든 Thread가 재시작 된다.
 *	- 이 경우 유효한 리소스만큼의 Thread만이 수행될 수 있고 자원을 갖지 못한 Thread의 경우는 다시 wait() 상태로 만든다.
 *	- 자바에서는 notifyAll() 메서드의 사용을 권장한다.
 *	- 도서관에서 책을 빌리는 예제
 *	- notify()를 사용하는 경우
 */
class FastLibrary {
	
	public ArrayList<String> shelf = new ArrayList<>(); 
	
	public FastLibrary() {
		
		shelf.add("태백산맥 1");
		shelf.add("태백산맥 2");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		
		if(shelf.isEmpty()) {
			System.out.println(t.getName() + " wating start");
			wait();
			System.out.println(t.getName() + " wating end");
		}

		String book = shelf.remove(0);
		System.out.println(t.getName() + ": " + book + " lend");
		return book;

	}
	
	public synchronized void returnBook(String book) {
		
		Thread t = Thread.currentThread();
		
		shelf.add(book);
		
		notify();
		
		System.out.println(t.getName() + ": " + book + " return");
	}
}

class Student extends Thread {
	
	public Student(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) {
				System.out.println(getName() + " : 책을 빌리지 못함");
				return;
			}
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
}

public class LibraryMain {
	
	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {
		
		Student st1 = new Student("s1");
		Student st2 = new Student("s2");
		Student st3 = new Student("s3");
		Student st4 = new Student("s4");
		Student st5 = new Student("s5");
		
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		
	}

}
