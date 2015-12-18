// Dakota Mitchem
// CS 202 Section 002
// Assignment 9.2

public class Main {

	public static void main(String[] args) {
		Book turtleDay= new Book("Turtle Day", "John P. Squiggles", 204);
		System.out.println(turtleDay);
		turtleDay.openBook();
		
		Novel squirrelCity = new Novel("Squirrel City", "Abraham Esparanza", 217, "Joe and Phil");
		System.out.println(squirrelCity);
		squirrelCity.spoilerAlert();
		
		Magazine dinosaurus= new Magazine("Dinosaurus", "Carlos Santana", 191);
		System.out.println(turtleDay);
		dinosaurus.gossip();
		
		Journal time = new Journal("Time Loops", "Albert Hawking", 207);
		System.out.println(time);
		time.article();
		
		Textbook CS = new Textbook("Computer Science", "Alfred Nobel", 497);
		System.out.println(CS);
		CS.purchase();

	}

}
