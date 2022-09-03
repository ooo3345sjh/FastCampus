package ch08;

public class AutoCloseTest {
	
	public static void main(String[] args) {

		AutoCloseableObj obj = new AutoCloseableObj();
		
		//AutoCloseable를 implements하여 close를 재정의함.
		//close가 자동으로 호출된다.
		try (obj) { 			   
			throw new Exception(); //예외를 일으키는 기능;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");

	}
}
