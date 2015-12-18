public class Novel extends Book {
	private String novelCharacters;
	
	
//Constructor
	public Novel(String title, String author, int pages, String characters) {
		super(title, author, pages);
		novelCharacters = characters;
	}

	//Get/Set
	public String getCharacters(){
		return novelCharacters;
	}
	public void setCharacters(String characters){
		novelCharacters=characters;
	}
	public String toString(){
		return super.toString() + " Characters: " +novelCharacters;
	}
	
	public void spoilerAlert(){
		System.out.println("Don't give away the ending");
	}
}
