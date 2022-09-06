package ch14;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 바이트 단위 입출력 스트림 
 */
public class FileInputStreamTest1 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("찾는 파일이 없음");
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("end");
		
	}

}
