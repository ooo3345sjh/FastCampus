package ch16;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 여러가지 보조 스트림 클래스들 
 * 	- InputStreamReader와 OutputStreamWriter
 */
public class InputStreamReaderTest {
	public static void main(String[] args) {
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			
			int i;
			
			while((i = isr.read()) != -1) { //보조 스트림으로 읽습니다.
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
