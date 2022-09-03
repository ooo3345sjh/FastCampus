package ch09;

import java.util.regex.*;

public class RegularExpressionTest {

	
	public static void main(String[] args) {
		
		String[] data = {"dgaj123", "abcdfer"};
		String[] pattern = {"^[a-zA-Z]+$"};
		
		for(int i=0; i<pattern.length; i++) {
			Pattern p = Pattern.compile(pattern[i]);
			System.out.print("Pattern : " + pattern[i] + "결과: ");
			for(int j=0; j<data.length; j++) {
				Matcher m = p.matcher(data[j]);
				if(m.matches()) {
					System.out.print(data[j] + ",");
				}
			}
			System.out.println();
		}
	
	
	
	}
	
}
