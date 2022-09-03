package ch09;

import java.util.regex.*;

public class RegularExpression {
	public static void main(String[] args) {
		
		String str = "a_b-c";
		
		
		// \W 의 경우 알파벳이나 숫자, 언더바(_)를 제외한 문자입니다.
        System.out.println(str.replaceAll("\\W", "")); 
        
        // \w 의 경우 알파벳이나 숫자, 언더바(_) 기호를 찾습니다.
        System.out.println(str.replaceAll("\\w", "")); 
        
        // 언더바(_)도 제외를 해야할 경우, 다음과 같이 작성해야 한다.
        System.out.println(str.replaceAll("[\\W_]", ""));
        
        System.out.println("==================");
        
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data1 = "010-1234-5678";	
		String data2 = "011-123-1234";	
		String data3 = "02-1234-123";	
		
		boolean result1 = Pattern.matches(regExp, data1); // true
		boolean result2 = Pattern.matches(regExp, data2); // false
		boolean result3 = Pattern.matches(regExp, data3); // false
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		System.out.println("==================");
		
		String regex = "^[a-zA-Z]*$";
		String input = "ABCdeZzZjf";
		String input2 = "ABcDe1Zzf";
		
		boolean resultA = Pattern.matches(regex, input);	// true	
		boolean resultB = Pattern.matches(regex, input2); // false
		
		System.out.println(resultA);
		System.out.println(resultB);
		
		System.out.println("==================");
		
		String str1 = "ABC1234DEFG!^/";
		String regex1 = "[0-9]";
		String regex2 = "[a-zA-Z]";
		String regex3 = "[!^/]";
		
		System.out.println("정규표현식 사용전: " + str1);
		
		System.out.println("정규표현식 숫자 제거: " + str1.replaceAll(regex1, ""));
		System.out.println("정규표현식 알파벳 제거: " + str1.replaceAll(regex2, ""));
		System.out.println("정규표현식 특수문자 제거: " + str1.replaceAll(regex3, ""));
		
	}
}