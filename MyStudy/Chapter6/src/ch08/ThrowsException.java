package ch08;

import java.io.*;

public class ThrowsException {
	
	public static Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
	
	
	public static void main(String[] args) {
		
		try {
			loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { //defalut Exception 설정
			System.out.println(e);
		}
			
	
	}
}
