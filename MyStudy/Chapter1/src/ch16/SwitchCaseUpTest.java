package ch16;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		int month = 13;
		
		int day = switch (month) {
	    	case 1, 3, 5, 7, 8, 10,12 -> 
	    		 31;
	    	
	    	case 4,6,9,11 -> 
	    		 30;
	    	
	    	case 2 ->
	    		 28;
	    	
	    	default-> {
	    		System.out.println("존재하지 않는 달입니다.");
	    		yield -1;
	    	}
		};
		System.out.println(month + "월은 " + day + "일입니다.");

	}
}

