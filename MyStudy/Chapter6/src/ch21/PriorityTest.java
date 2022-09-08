package ch21;

/*
 * 날짜 : 2022/09/07
 * 이름 : 서정현
 * 내용 : Thread 클래스의 여러 메서드들
 * 	
 * 	* Thread 우선순위
 * 	- Thread.MIN_PRIORITY(=1) ~ Thread.MAX_PRIORITY(=10)
 *	- 디폴트 우선순위 : Thread.NORMAL_PRIORITY(=5)
 * 	- 우선 순위가 높은 Thread가 CPU의 배분을 받을 확률이 높다
 *	- setPriority()/getPriority()
 */

class PriorityThread extends Thread {
	
	public void run() {
		
		int sum = 0;
		
		Thread t = Thread.currentThread();
		System.out.println(t + "start");
		
		for(int i = 0; i <= 1000000; i++) {
			
			sum += i;
		}
		
		System.out.println(t.getPriority() + "end");
	};
	
}

public class PriorityTest {
	
	public static void main(String[] args) {
	
		int i;
		Thread th1 = new PriorityThread();
		Thread th2 = new PriorityThread();
		Thread th3 = new PriorityThread();
		
		th1.setName("A");
		th2.setName("B");
		th3.setName("C");
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
		
		th1.start();
		th2.start();
		th3.start();
		
	}

}
