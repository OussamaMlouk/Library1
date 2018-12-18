package Library;

public abstract class Item {
	private String title;
	private int length;
	private String author;
	private boolean available;

	public Item(String title, int length, String author, boolean available) {
		this.title = title;
		this.length = length;
		this.author = author;
		this.available = available;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public String getAuthor() {
		return author;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
