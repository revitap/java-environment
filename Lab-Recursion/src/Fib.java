
public class Fib {
	
	/* 
	 * Create algorithm to compute the Fibonacci sequence of the nth value, 
	 * where n is a specified parameter
	 */
	public int fibonacci(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
