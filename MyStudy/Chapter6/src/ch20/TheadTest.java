package ch20;

/*
 * 날짜 : 2022/09/06
 * 이름 : 서정현
 * 내용 : 자바에서 Thread 만들기
 * 	- Thread 클래스 상속하여 만들기
 */
class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i <= 200; i++) {
			System.out.print(i + "\t");
		}
	}
	
}

public class TheadTest {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
	
		System.out.println(Thread.currentThread() + "end");
	}
}
