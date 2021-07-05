package main;

import java.util.Scanner;

public class Converter2 {
	
	public static void main(String[] args) {
		
		int menuSelection = 0;
		Scanner sc = new Scanner(System.in);	
			
		while (menuSelection != 3) {
			//Main menu
			System.out.println("Please Select An Option:");
			System.out.println("1. Volume Conversions");
			System.out.println("2. Distance Conversions");
			System.out.println("3. Quit");
			System.out.println("Enter Option: ");
			menuSelection = sc.nextInt();
			int ch;
			//Sub-menu
			switch(menuSelection) 
			{			
			// Sub-Menu: Volume Conversions
			case 1: 
				// Volume Conversions
				System.out.println("Please Select Conversion Type:");
				System.out.println("1. Teaspoons to Tablespoons");
				System.out.println("2. Teaspoons to Cups");
				System.out.println("Enter your choice: ");
				ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					// Teaspoons to Tablespoons
					double tspNum, tbsNum, cupNum;
					System.out.println("Please enter number of teaspoons: ");
					tspNum = sc.nextDouble();
					tbsNum = tspNum * 0.333333;
					System.out.println(tspNum + " teaspoon(s) is equal to " + convertTspToTbs(tspNum) + " tablespoons.\n");
					break;
				case 2:
					// Teaspoons to Cups
					System.out.println("Please enter number of teaspoons: ");
					tspNum = sc.nextDouble();
					cupNum = tspNum * 0.0208333;
					System.out.println(tspNum + " teaspoon(s) is equal to " + convertTspToC(tspNum) + " cups.\n");
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			// Sub-Menu: Distance Conversions
			case 2:
				// Distance Conversions
				System.out.println("Please Select Conversion Type:");
				System.out.println("1. Feet to Meters");
				System.out.println("2. Miles to Kilometers");
				System.out.println("Enter your choice: ");
				ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					// Feet to Meters
					double ftNum, mileNum, mtrNum, kilometerNum;
					System.out.println("Please enter number of feet: ");
					ftNum = sc.nextDouble();
					mtrNum = ftNum * 0.3048;
					System.out.println(ftNum + " foot/feet is equal to " + convertFtToM(ftNum) + " meters.\n");
					break;
				case 2:
					// Miles to Kilometers
					System.out.println("Please enter number of miles: ");
					mileNum = sc.nextDouble();
					kilometerNum = mileNum * 0.621371;
					System.out.println(mileNum + " mile(s) is equal to " + convertMiToKm(mileNum) + " kilometers.\n");
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			// Quit
			case 3:
				System.out.println("Quit selected. Goodbye.");
				break;
			// Default	
			default:
				System.out.println("Invalid option. Please select another option.\n");
			}
		}
	
	// Break the input collection to a separate method
//	private static double input (double teaspoons, double tablespoons, double feet, double meters, double miles, double kilometers) {
//		return  
//	}
	
	}
	
	// Break each unit conversion to a separate method	
	public static double convertTspToTbs(double tspNum) {
		return tspNum * 0.333333;
	}
	
	public static double convertTspToC(double tspNum) {
		return tspNum * 0.0208333;
	}
	
	public static double convertFtToM(double ftNum) {
		return ftNum * 0.3048;
	}
	
	public static double convertMiToKm(double mileNum) {
		return mileNum * 0.621371;
	}

}
