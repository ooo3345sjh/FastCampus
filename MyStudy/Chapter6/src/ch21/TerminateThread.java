package ch21;

import java.io.*;
import java.util.*;

/*
 * 날짜 : 2022/09/07
 * 이름 : 서정현
 * 내용 : Thread 클래스의 여러 메서드들
 * 	
 * 	* interrupt()
 * 	- 다른 Thread에 예외를 발생시키는 interrupt를 보낸다.
 *	- Thread가 join(), sleep(), wait() 함수에의해 not-runnable 상태일 때 
 *	  interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음
 *	- Thread를 종료할 때 사용함
 *	- 무한 반복의 경우 while(flag)의 flag 변수값을 false로 바꾸어 종료를 시킴
 */
public class TerminateThread extends Thread {
	
	private boolean flag = false;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		while(!flag) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
			System.out.println(getName() + " end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {
	
		TerminateThread th1 = new TerminateThread("A");
		TerminateThread th2 = new TerminateThread("B");
		TerminateThread th3 = new TerminateThread("C");
		
		th1.start();
		th2.start();
		th3.start();
		
		int in;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			in = sc.nextLine().charAt(0);
			
			if(in == 'A') {
				th1.setFlag(true);
				
			} else if(in == 'B') {
				
				th2.setFlag(true);
				
			} else if(in == 'C') {
				
				th3.setFlag(true);
				
			} else if(in == 'M') {
				
				th1.setFlag(true);
				th2.setFlag(true);
				th3.setFlag(true);
				break;
				
			} else {
				System.out.println("type again");
			}
		}
		
		System.out.println("main end");
		
		
	}

}
