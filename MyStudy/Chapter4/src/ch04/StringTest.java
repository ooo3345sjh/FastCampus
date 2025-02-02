package ch04;

import java.lang.reflect.*;

public class StringTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");

		Constructor[] cons = c.getConstructors();
		for(Constructor cs : cons) {
			System.out.println(cs);
		}
		
		System.out.println();
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}

	}
}
