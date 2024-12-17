package test;

public class Book {

	private int bookId;
	private String title;
	private String auther;
	
	public Book( int bookId, String title,  String auther) {
		this.bookId = bookId;
		this.title = title;
		this.auther = auther;
		
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", auther=" + auther + "]";
	}
	
	
}

