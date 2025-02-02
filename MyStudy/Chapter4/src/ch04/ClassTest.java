package ch04;

import java.lang.reflect.*;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c1 = Class.forName("ch04.Person");
		
		Person person1 = (Person)c1.newInstance();
		
		person1.setName("Lee");
		System.out.println(person1);
		
		System.out.println("========================");
		
		Class c2 = person1.getClass();
		Person person2 = (Person)c2.newInstance();
		System.out.println(person2);
		
		Class[] parameterTypes = {String.class, int.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"kim", 18};
		Person person3 = (Person)cons.newInstance(initargs);
		System.out.println(person3);
		/*
		 *	Person person = new Person("kim", 18)과 동일.
		 *	저렇게 코드가 길고 비횰적인데 사용하는 이유 
		 * 	로컬 메모리에 객체 없는 경우, 원격 프로그래밍, 객체의 타입을 알 수 없는 경우에 사용
		 *  일반적으로 자료형을 알고 있는 경우엔 사용하지 않음
		 */
		
		
		
		
	}
}
