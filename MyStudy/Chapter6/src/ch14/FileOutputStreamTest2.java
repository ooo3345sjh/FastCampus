package ch14;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 바이트 단위 입출력 스트림 
 * 	- byte[] 배열에 A-Z 까지 넣고 배열을 한꺼번에 파일에 쓰기
 */
public class FileOutputStreamTest2 {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt");
		
		try(fos) { //java9부터 제공되는 기능
			byte[] bs = new byte[26];
			byte data = 65;
			
			for(int i=0; i<bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
