package ch14;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 바이트 단위 입출력 스트림 
 */
public class FileInputStreamTest2 {
	public static void main(String[] args) {
		
		int i;
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("end");
		
	}

}
