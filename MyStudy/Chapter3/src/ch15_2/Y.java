package ch15_2;

public interface Y {
	
	void y();
	
	default void show() {
		System.out.println("show y()");
	}
}
