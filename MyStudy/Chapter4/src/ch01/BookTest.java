package ch01;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + ", " + author;
	}
	
	
	
}

public class BookTest{
	public static void main(String[] args) {
		
		Book book = new Book("소나기", "서정현");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);
	}
}
