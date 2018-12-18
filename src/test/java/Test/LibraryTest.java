package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Library.Book;

import Library.Library;

import Library.Person;

public class LibraryTest {

	

	@Test
	public void test1() {
		Library library = new Library();
		Book b1 = new Book("", 0, "", true, "");

		library.addItem(b1);
		assertEquals(1, library.itemList.size());

	}

	@Test
	public void test2() {
		Library library = new Library();
		Book b1 = new Book("", 0, "", true, "");

		library.addItem(b1);
		assertEquals(1, library.itemList.size());
		library.removeItem(b1);
		assertEquals(0, library.itemList.size());

	}

	@Test
	public void test3() {
		Library library = new Library();
		Book b1 = new Book("", 0, "", true, "");

		library.addItem(b1);
		assertEquals(true, library.checkOut(b1));
		assertEquals(false, b1.getAvailable());

	}

	@Test
	public void test4() {
		Library library = new Library();
		Book b1 = new Book("", 0, "", false, "");

		library.addItem(b1);
		assertEquals(false, library.checkOut(b1));

	}

	@Test
	public void test5() {
		Library library = new Library();
		Book b1 = new Book("", 0, "", false, "");

		library.addItem(b1);
		library.checkIn(b1);
		assertEquals(true, b1.getAvailable());

	}

	@Test
	public void test6() {
		Library library = new Library();
		Book b1 = new Book("", 0, "", true, "");

		library.addItem(b1);
		assertEquals(false, library.checkIn(b1));

	}

	@Test
	public void test7() {
		Library library = new Library();
		Person p1 = new Person("", 0);
		Person p2 = new Person(" ", 1);
		
		assertEquals(1, p1.getId());
		assertEquals(2, p2.getId());
		
		library.registerPerson(p1);
		assertEquals(1, library.personList.size());

	}
	
	@Test
	public void test8() {
		Library library = new Library();
		Person p1 = new Person("", 0);
		
		library.registerPerson(p1);
		assertEquals(1, library.personList.size());

		library.deletePerson(p1);
		assertEquals(0, library.personList.size());

	}
	
	@Test
	public void test9() {
		Library library = new Library();
		Book b1 = new Book("", 0, "", true, "");
		
		library.updateItem(b1, "author", "James");
		assertEquals("James", b1.getAuthor());
		
	}
	
	@Test
	public void test10() {
		Library library = new Library();
		Person p1 = new Person("", 0);
		
		library.updatePerson(p1, "name", "James");
		assertEquals("James", p1.getName());
		
	}

}
