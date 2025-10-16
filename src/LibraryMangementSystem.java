// Mini-project : Library Mangement System

import java.util.Scanner;

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
		System.out.println(id + ":" + title + " : Issued :" + issued);
	}
}


abstract class LibraryManager{              // Abstraction
	abstract void issue(Book b);
	abstract void returnBook(Book b);
}

class Library extends LibraryManager{
	
	@Override
	void issue(Book b){
		if(!b.isIssued()){
			b.issue();
			System.out.println("Book issued:" + b.getTitle());
		} else {
			System.out.println("Book Already issued");
		}
	}
	
	@Override
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
		super(name);
	}
	@Override
	public void display(){
		System.out.println("Librarian:" + name);
	}
}

public class LibraryMangementSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Library lib = new Library();
		
		Book b1 = new Book(1, "Java");
		Book b2 = new Book(2, "ADS");
		Book b3 = new Book (3, "DBT");
		Book b4 = new Book(4, "Operating System");
		
		Book[] books = {b1, b2, b3, b4};
		
		Student s1 = new Student("Samiksha");
		Student s2 = new Student("Pranali");
		Student s3 = new Student("Sanket");
		
		Student[] students = {s1, s2, s3};
		
		Librarian libr = new Librarian("Mr.Jon");
		
		int select;
		do{
			System.out.println("**********************************");
			System.out.println("Welcome to Library...!!!📚");
			
			System.out.println("1.Display Books:");
			System.out.println("2.Issue Book:");
			System.out.println("3.Return Books:");
			System.out.println("4.Students:");
			System.out.println("5.Librarian:");
			System.out.println("6.Exit");
			System.out.println("**********************************");
			System.out.print("Select:");
			
			
			select = sc.nextInt();
			
			if(select == 1){
				System.out.println("You Selected: Display Books");
				for(Book b : books){
					b.display();
				}
			}
			else if(select == 2){
				System.out.println("You Selcted: Issue Book");
				System.out.println("Enter book id to issue:");
				int id = sc.nextInt();
				boolean found = false;
				for (Book b : books){
					if(b.getId() == id){
					  lib.issue(b);
					   found = true;
					   break;
					  
					}
				}
				if(!found)
					System.out.println("book not found");
			}
			else if(select == 3){
				System.out.println("You Selected: Retuns Books");
				System.out.print("Enter book id to return: ");
				int id = sc.nextInt();
				boolean found = false;
				for(Book b : books) {
					if (b.getId() == id){
						lib.returnBook(b);
						found = true;
						break;
					}
				}
				if(!found)
					System.out.println("book not found");
			}
			else if(select == 4){
				System.out.println("You Selcted: Students");
				for(Student s : students){
					s.display();
				}
			}
			else if(select == 5){
				System.out.println("You selected: Librarian");
				libr.display();
			}
			else if(select == 6){
				System.out.println("Exiting the library");
			}
			else{
				System.out.println("Invalid select");
			}
			
		} while (select != 6);
		
		
	  	
	}
	

}