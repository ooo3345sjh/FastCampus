package ch16;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 여러가지 보조 스트림 클래스들 
 * 	- BufferedInputStream과 BufferedOutputStream
 */
public class BufferedStreamReaderTest {
	public static void main(String[] args) {
		
		long millonSecond = 0;
		
		try(FileInputStream fis = new FileInputStream("a.zip"); 
			FileOutputStream fos = new FileOutputStream("copy.zip"))
		{
			
			millonSecond = System.currentTimeMillis();
			
			int i;
			
			while((i = fis.read()) != -1) { //보조 스트림으로 읽습니다.
				fos.write(i);
			}
			
			millonSecond = System.currentTimeMillis() - millonSecond;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("기반I/O 파일 복사 소요 시간 : " + millonSecond / 1000.0 + "초");
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip")); 
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip")))
		{
			
			millonSecond = System.currentTimeMillis();
			
			int i;
			
			while((i = bis.read()) != -1) { //보조 스트림으로 읽습니다.
				bos.write(i);
			}
			
			millonSecond = System.currentTimeMillis() - millonSecond;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("BufferedI/O 파일 복사 소요 시간 : " + millonSecond / 1000.0 + "초");
		
	}

}
