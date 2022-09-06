package ch17;

import java.io.*;

/*
 * 날짜 : 2022/09/05
 * 이름 : 서정현
 * 내용 : 직렬화 (serialization) 
 * 	- Externalizable 인터페이스
 * 	- writerExternal()과 readExternal()메서드를 구현해야 함
 * 	- 프로그래머가 직접 객체를 읽고 쓰는 코드를 구현 할 수 있음
 */
class Person1 implements Externalizable{
	
	private static final long serialVersionUID = -1503252402544036183L;

	String name;
	transient String job;
	
	public Person1() {}

	public Person1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
	}

}


public class ExternalizableTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person1 personAhn = new Person1("이순신", "대표이사");
		Person1 personKim = new Person1("김유신", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person1 p1 = (Person1)ois.readObject();
			Person1 p2 = (Person1)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

