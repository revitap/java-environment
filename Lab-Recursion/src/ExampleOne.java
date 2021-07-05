
public class ExampleOne {

	public static void main(String[] args) {
		// Create some dummy data for our method
		int input = 5;
		
		ExampleOne eo = new ExampleOne();
		
		// Call your methods here
		System.out.println(eo.factorial(input));
	}
	
	// Create your first method here
	public int factorial(int num) {
		if (num <= 0) return 0;
		if (num == 1) return 1;
		
		return num * factorial(num-1);
	}
	

}
