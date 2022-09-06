package ch15;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 문자 단위 입출력 스트림 
 * 	- Writer
 */
public class FileWriterTest {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")) {
			
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("안녕하세요. 잘 써지네요."); //String
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
