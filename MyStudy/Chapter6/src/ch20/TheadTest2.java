package ch20;

/*
 * 날짜 : 2022/09/06
 * 이름 : 서정현
 * 내용 : 자바에서 Thread 만들기
 * 	- Runnable 인터페이스 구현하여 만들기
 */
class MyThread2 implements Runnable {

	@Override
	public void run() {
		
		for(int i = 1; i <= 200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class TheadTest2 {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start");
		Thread th1 = new Thread(new MyThread2());
		Thread th2 = new Thread(new MyThread2());
		
		th1.start();
		th2.start();
	
		System.out.println(Thread.currentThread() + "end");
	}
}
