package ch09;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : 제네릭 메서드 활용하기
 */
public class Point<T,V> {
	
	T x;
	V y;
	
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getx() {
		return x;
	}
	
	public V gety() {
		return y;
	}
}
