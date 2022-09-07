package ch19;

/*
 * 날짜 : 2022/09/06
 * 이름 : 서정현
 * 내용 : 데코레이터 패턴을 활용한 커피 머신 프로그램
 */
public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Coffee kenyaAmericano = new KenyaAmericano();
		kenyaAmericano.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(kenyaAmericano);
		kenyaLatte.brewing();
		System.out.println();
		
		Mocha kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		kenyaMocha.brewing();
		System.out.println();
		
		WhippedCream etiopiaWhippedMocha = 
				new WhippedCream(new Mocha(new Latte( new EtiopiaAmericano())));
		etiopiaWhippedMocha.brewing();
		System.out.println();
	}
	
}
