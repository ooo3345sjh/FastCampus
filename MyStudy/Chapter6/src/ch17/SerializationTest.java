package ch17;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 직렬화 (serialization) 
 * 	- Serializable 인터페이스
 * 	- 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
 * 	- 구현 코드가 없는 marker interface
 * 	- transient : 직렬화 하지 않으려는 멤버 변수에 사용함 (Socket등 직렬화 할 수 없는 객체)
 */
class Person implements Serializable{
	
	private static final long serialVersionUID = -1503252402544036183L;

	String name;
	transient String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
}


public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personAhn = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

