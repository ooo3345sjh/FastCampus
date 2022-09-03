package ch08;

public class ArrayIndexException {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for(int i=0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		System.out.println("here!!!");
	}

}
