package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		/*
		 * String 문자열을 연결할 때 기존의 java변수에 문자열이 추가 되는 것이 아닌  
		 * 새로운 문자열이 생성됨(메모리 낭비가 발생할 수 있음)
		 */
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		System.out.println("================================");
		/*
		 * StringBuilder는 String 문자열을 여러번 연결하거나 변경할 때 
		 * 발생할 수 있는 메모리 낭비를 방지 할 수 있어 사용하면 유용함.
		 */
		String git = new String("git");
		StringBuilder buffer = new StringBuilder(git);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		buffer.append("java");
		System.out.println(System.identityHashCode(buffer));
		
		git = buffer.toString();
		
		System.out.println(git);
		
		
	}

}
