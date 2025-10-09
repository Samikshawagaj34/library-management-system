// Mini-project : Library Mangement System

class Book{
	private int id;
	private String title;
	private boolean issued;
	
	public Book(int id,  String title){
		this.id = id;
		this.title = title;
		this issued = false;
		
	}
	
	public int getId(){
		return id
	}
	
	public String getTitl(){
		return title;
	}
	
	public boolean isIssued(){
		return issued;
	} 
	
	public void setIssued(boolean issued){
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

public class LibraryMangementSystem{
	public static void main(String[] args){
	  	
	}
	

}