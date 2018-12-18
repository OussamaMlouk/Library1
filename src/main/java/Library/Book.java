package Library;

public class Book extends Item {
	private String publisher;
	
	public Book(String title, int length, String author, boolean available, String publisher) {
		super(title, length, author, available);
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
