// Mini-project : Library Mangement System

class Book{                       //Encapsulation
	private int id;
	private String title;
	private boolean issued;
	
	public Book(int id,  String title){
		this.id = id;
		this.title = title;
		this.issued = false;
		
	}
	
	public int getId(){              // getter method
		return id;
	}
	
	public String getTitle(){
		return title;
	}
	
	public boolean isIssued(){
		return issued;
	} 
	
	public void setIssued(boolean issued){    // setter method
		this.issued = issued;
	}
	
	public void issue(){
		setIssued(true);
		
	}
	
	public void returnBook(){
		setIssued(false);
	}
	
	public void display(){
		System.out.println(id + ":" + title + " : Issued :" + issue);
	}
}


abstract class LibraryManager{              // Abstraction
	abstract void issue(Book b);
	abstract void returnBook(Book b);
}

class Library extends LibraryManager{
	
	@override
	void issue(Book b){
		if(!b.isIssued()){
			b.issue();
			System.out.println("Book issued:" + b.getTitle());
		} else {
			System.out.printn("Book Already issued");
		}
	}
	
	@override
void returnBook(Book b){
	if(b.isIssued()){
		b.returnBook();
		System.out.println("Book returned:" + b.getTitle());
	} else {
		System.out.println("Not issued Book");
	}
}
}

class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	
	public void display(){
		System.out.println("Student:" + name);
	}
}
class Librarian extends Student{
	public Librarian(String name){
		this.name = name;
	}
	@override
	public void display(){
		System.out.println("Librarian:" + name);
	}
}

public class LibraryMangementSystem{
	public static void main(String[] args){
	  	
	}
	

}