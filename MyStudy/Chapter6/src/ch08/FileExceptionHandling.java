package ch08;

import java.io.*;

/* 
 * 날짜 : 2022/09/03
 * 이름 : 서정현
 * 내용 : 예외 처리하기와 미루기(1)
 */
public class FileExceptionHandling {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		
/*		##try-with-finally문## - try와 catch부분에 각각 파일을 닫아주어야하는 불편함이 있다.
	
		try {
			
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
			try {
				                                          
				fis.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		} catch (Exception e) {
			System.out.println(e);
			
			try {
				fis.close();
			} catch (NullPointerException | IOException e1) {
				System.out.println(e);
			}
			
		}
*/		
		
//======================================================================================	
		
/*		##try-with-finally문##
 
		try {
			
			fis = new FileInputStream("a.txt");
			
		} catch (Exception e) {
			System.out.println(e);
	//		return;								//리턴이 되어도 finally는 수행된다.
		} finally {								//finally 블럭에서 파일을 닫거나 네트윅을 닫는 등의 리소스 해제 구현을 함 
			try {								//try 수행되면 finally 블럭은 항상 수행됨
				fis.close();
			} catch (NullPointerException | IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
*/	
//======================================================================================

//		##try-with-resources문## 		
//		- close()를 명시적으로 호출하지 않아도 try{}블록에서 열린 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 해제됨
  		
		
  		try (FileInputStream fis2 = new FileInputStream("a.txt")) {
			
		} catch (FileNotFoundException e) { //파일이 없을 때 일어나는 예외
			e.printStackTrace();
		} catch (IOException e) {			//파일을 close 할 때 close할 파일이 없을 때 일어나는 예외
			e.printStackTrace();
		} 
  		
  		System.out.println("end");
		
	}
}
