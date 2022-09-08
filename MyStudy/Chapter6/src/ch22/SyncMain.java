package ch22;

/*
 * 날짜 : 2022/09/08
 * 이름 : 서정현
 * 내용 : 멀티 Thread 프로그래밍에서의 동기화
 * 
 * 	* 동기화 (synchronization)
 * 	- 두 개의 thread 가 같은 객체에 접근 할 경우, 동시에 접근 함으로써 오류가 발생
 * 	- 동기화는 임계영역에 접근한 경우 공유자원을 lock 하여 다른 thread의 접근을 제어
 * 	- 동기화를 잘못 구현하면 deadlock에 빠질 수 있다.
 * 	- 자바에서는 synchronized 메서드나 synchronized 블럭을 사용
 */
class Bank {
	private int money = 10000;
	
	//synchronized메서드를 이용한 동기화방법
	public synchronized void saveMoney(int save) {
		
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	//synchronized 블럭을 이용한 동기화방
	public void minusMoney(int minus) {
		
		synchronized (this) {
			
			int m = this.getMoney();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m - minus);
		}
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
	
}

class Park extends Thread {
	
	@Override
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("save(3000) : " + SyncMain.myBank.getMoney());
	}
}

class ParkWife extends Thread {
	
	@Override
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minus(1000) : " + SyncMain.myBank.getMoney());
	}
}


public class SyncMain {
	
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		
		Park p = new Park();
		ParkWife pw = new ParkWife();
		
		pw.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		p.start();
		
		
	}

}
