package ch15;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 문자 단위 입출력 스트림 
 * 	- Reader
 */
public class FileReaderTest {
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
