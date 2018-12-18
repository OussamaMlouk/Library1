package Library;

public class Person {
	private int id;
	private static int counter = 1;
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
		this.id = counter;
		counter +=1;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
