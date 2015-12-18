public class Book {
	private String bookTitle;
	private String bookAuthor;
	private int bookPages;
	//Constructor
	public Book(String title, String author, int pages){
		bookTitle=title;
		bookAuthor=author;
		bookPages= pages;
	}
	//Get/Set
	public String getTitle(){
		return bookTitle;
	  }
	public String getAuthor(){
		return bookAuthor;
	  }
	public int getPages(){
		return bookPages;
	  }
	public void setTitle(String title){
	    bookTitle = title;
	  }
	public void setAuthor(String author){
	    bookAuthor = author;
	  }
	public void setPages(int pages){
	    bookPages = pages;
	  }
	public String toString(){
	    return bookTitle + ", Author: " + bookAuthor + ", Pages: " + bookPages;
	  }
	
	
	public void openBook(){
		System.out.println("Chapter 1..");
	}
}
