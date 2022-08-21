package ch08;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : <T extends 클래스> 사용하기
 */
public class PrinterTest {
	public static void main(String[] args) {
		
		Plastic plastic = new Plastic();
		Powder powder = new Powder();
		Water water = new Water();
		
		GenericPrinter<Plastic> genericPrinter1 = new GenericPrinter<>();
		genericPrinter1.setMaterial(plastic);
		plastic = genericPrinter1.getMaterial();
		System.out.println(genericPrinter1.getMaterial());
		
		GenericPrinter<Powder> genericPrinter2 = new GenericPrinter<>();
		genericPrinter2.setMaterial(powder);
		powder = genericPrinter2.getMaterial();
		System.out.println(genericPrinter2.getMaterial());
		
		//GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();
		//Water은 Material상속을 받지 않고 있으므로 제네릭타입으로 지정할 수 없어 컴파일 오류가 발생한다.
		
		// <>연산자 안에 타입을 입력하지 않고도 객체를 생성할 수 있으며, 생성되는 객체의 타입은 Object이다.
		GenericPrinter genericPrinter3 = new GenericPrinter(); 
		genericPrinter3.setMaterial(powder);
		powder = (Powder)genericPrinter3.getMaterial();
		System.out.println(genericPrinter3.getMaterial());
		
		
	}
}
