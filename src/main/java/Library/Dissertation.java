package Library;

public class Dissertation extends Item {
	private String subject;
	
	public Dissertation(String title, int length, String author, boolean available, String subject){
		super(title, length, author, available);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
