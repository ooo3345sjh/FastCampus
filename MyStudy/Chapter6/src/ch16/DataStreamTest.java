package ch16;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 여러가지 보조 스트림 클래스들 
 * 	- DataInputStream과 DataOutputStream
 */
public class DataStreamTest {
	public static void main(String[] args) {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))) {

			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		try(DataInputStream ios = new DataInputStream(new FileInputStream("data.txt"))) {
			
			System.out.println(ios.readByte());
			System.out.println(ios.readChar());
			System.out.println(ios.readInt());
			System.out.println(ios.readFloat());
			System.out.println(ios.readUTF());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
