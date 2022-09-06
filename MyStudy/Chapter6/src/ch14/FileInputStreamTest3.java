package ch14;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 바이트 단위 입출력 스트림 
 */
public class FileInputStreamTest3 {
	public static void main(String[] args) {
		
		int i;
		byte[] bs = new byte[10];
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			
			while((i = fis.read(bs)) != -1) {
				/*
				for(byte c : bs) {
					System.out.print((char)c);
				}
				*/
				for(int j=0; j<i; j++) {
					
					System.out.print((char)bs[j]);
				}
				
				System.out.println(" : " + i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		System.out.println("end");
		
	}

}
