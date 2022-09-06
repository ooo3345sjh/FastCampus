package ch18;

import java.io.*;

/*
 * 날짜 : 2022/09/06
 * 이름 : 서정현
 * 내용 : RandomAccessFile 클래스
 * 	- 입출력 클래스 중 유일하게 파일에 대한 입력과 출력을 동시에 할 수 있는 클래스
 * 	- 파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능함
 * 	- 다양한 메서드가 제공됨
 */
public class RandomAccessFileTest {
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		rf.seek(0);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		
		rf.close();
		
		File file = new File("C:\\Users\\ooo33.DESKTOP-56U45AS\\Desktop\\Workspace\\FastCampus\\MyStudy\\Chapter6\\random.txt");
		
		System.out.println(file.delete());
		
	}

}
