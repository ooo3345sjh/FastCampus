package ch13;

import java.io.*;

/*
 * 날짜 : 2022/09/04
 * 이름 : 서정현
 * 내용 : 표준 입출력 스트림 
 */
public class SystemInTest1 {
	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		int i;
		
			try {
				
				i = System.in.read();
				System.out.println(i);
				System.out.println((char)i);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
