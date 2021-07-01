
public class Constructors {
	
	// no-arg constructor
	public Constructors() {
		System.out.println("Default constructor ran.");
	}
	
	// create constructor
	public Constructors(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		// create instances here
		Constructors c = new Constructors(5839);
		
		// use the no-arg constructor
		Constructors cNoArg = new Constructors();

	}

}
