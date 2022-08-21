package ch08;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : <T extends 클래스> 사용하기
 */
public class GenericPrinter<T extends Material> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T plastic) {
		this.material = plastic;
	}
	

}
