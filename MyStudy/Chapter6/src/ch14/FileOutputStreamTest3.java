package ch14;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 바이트 단위 입출력 스트림 
 * 	- byte[] 배열의 특정 위치에서 부터 정해진 길이 만큼 쓰기
 */
public class FileOutputStreamTest3 {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output3.txt", true); // true를 하면 append 저장됨.
		
		try(fos) { //java9부터 제공되는 기능
			byte[] bs = new byte[26];
			byte data = 65;
			
			for(int i=0; i<bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs, 1, 10);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
