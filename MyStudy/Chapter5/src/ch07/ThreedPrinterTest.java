package ch07;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : 제네릭 자료형 정의
 */
public class ThreedPrinterTest {
	public static void main(String[] args) {
		
		Plastic plastic = new Plastic();
		Powder powder = new Powder();
		
		ThreedPrinter1 plasticPrinter = new ThreedPrinter1();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter.getMaterial());
		
		ThreedPrinter2 powderPrinter = new ThreedPrinter2();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter.getMaterial());
		
		ThreedPrinter3 printer = new ThreedPrinter3();
		printer.setMaterial(powder);
		powder = (Powder)printer.getMaterial(); //타입이 Object클래스이기때문에 형변환을 해주어야한다.
		System.out.println(printer.getMaterial());
		
		GenericPrinter<Plastic> genericPrinter = new GenericPrinter<>();
		genericPrinter.setPlastic(plastic);
		plastic = genericPrinter.getPlastic();
		System.out.println(genericPrinter.getPlastic());
		
		
	}
}
