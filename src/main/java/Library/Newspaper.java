package Library;

public class Newspaper extends Item {
	private int year;
	
	public Newspaper(String title, int length, String author, boolean available, int year) {
		super(title, length, author, available);
		this.year =  year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
