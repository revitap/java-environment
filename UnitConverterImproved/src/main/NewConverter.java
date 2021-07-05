package main;

public class NewConverter {
	
	public static void main(String[] args) {
		
	}
	
	// Break the input collection to a separate method
//	private static double input (double teaspoons, double tablespoons, double feet, double meters, double miles, double kilometers) {
//		return  
//	}
	
	private static double input(double teaspoons, double tablespoons, double feet, double meters, double miles, double kilometers) {
		System.out.println(teaspoons + " = " + convertTspToTbs(teaspoons) + " tablespoons");  
	}
	
	// Break each unit conversion to a separate method	
	public double convertTspToTbs(double teaspoons) {
		return teaspoons * 0.333333;
	}
	
	public double convertTspToC(double teaspoons) {
		return teaspoons * 0.0208333;
	}
	
	public double convertFtToM(double feet) {
		return feet * 0.3048;
	}
	
	public double convertMiToKm(double miles) {
		return miles * 0.621371;
	}


	

}
