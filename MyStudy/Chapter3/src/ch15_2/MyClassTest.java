package ch15_2;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		xClass.show();
		
		
		Y yClass = mClass;
		yClass.y();
		yClass.show();
		
		MyClass iClass = mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		iClass.show();

	}

}
