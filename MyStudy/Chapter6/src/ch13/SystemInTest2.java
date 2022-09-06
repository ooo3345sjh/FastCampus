package ch13;

import java.io.*;

public class SystemInTest2 {
	public static void main(String[] args) {

		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		
		int i;
		
			try {
				
				Reader ir = new InputStreamReader(System.in);
				
				while(/*(i = System.in.read())*/ (i=ir.read()) != '\n') {
					System.out.print((char)i);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
