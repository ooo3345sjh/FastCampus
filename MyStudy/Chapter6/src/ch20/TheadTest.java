package ch20;

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
