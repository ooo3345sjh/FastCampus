package ch15_2;

public interface MyInterface extends X, Y {

	void myMethod();

	@Override
	default void show() {
		// TODO Auto-generated method stub
		Y.super.show();
	}
}
