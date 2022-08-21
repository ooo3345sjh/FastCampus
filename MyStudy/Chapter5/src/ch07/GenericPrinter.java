package ch07;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : 제네릭 자료형 정의
 */
public class GenericPrinter<T> {
	
	private T material;

	public T getPlastic() {
		return material;
	}

	public void setPlastic(T plastic) {
		this.material = plastic;
	}
	

}
