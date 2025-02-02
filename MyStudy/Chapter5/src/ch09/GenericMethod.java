package ch09;

/*
 * 날짜 : 2022-08-20
 * 이름 : 서정현
 * 내용 : 제네릭 메서드 활용하기
 */
public class GenericMethod {
	
	public static <T,V> double makerectangle(Point<T,V> p1, Point<T,V> p2) {
		double left = ((Number)p1.getx()).doubleValue();
		double right = ((Number)p2.getx()).doubleValue();
		double top = ((Number)p1.gety()).doubleValue();
		double bottom = ((Number)p2.gety()).doubleValue();
		
		double width = Math.abs(left - right); 
		double height = Math.abs(top - bottom);
		
		return width*height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(5, 5.0);
		
		double rect = GenericMethod.makerectangle(p1, p2);
		System.out.println(rect);
	}

}
