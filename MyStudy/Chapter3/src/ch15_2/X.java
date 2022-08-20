package ch15_2;

public interface X {
	
	void x();
	
	default void show() {
		System.out.println("show x()");
	}
}
