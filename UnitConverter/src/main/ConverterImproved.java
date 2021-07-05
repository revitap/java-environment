package main;

import java.util.Scanner;

public class ConverterImproved {
	
	public static void main(String[] args) {
		
		int menuSelection = 0;
		Scanner sc = new Scanner(System.in);	
			
		while (menuSelection != 3) {
			//Main menu
			System.out.println("***************************");
			System.out.println(" MAIN MENU: UNIT CONVERTER");
			System.out.println("***************************");
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
				System.out.println("*****************************");
				System.out.println(" SUB-MENU: VOLUME CONVERSION");
				System.out.println("*****************************");
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
					System.out.println(tspNum + " teaspoon(s) is equal to " + convertTspToTbs(tspNum) + " tablespoons.\n");
					break;
				case 2:
					// Teaspoons to Cups
					System.out.println("Please enter number of teaspoons: ");
					tspNum = sc.nextDouble();
					System.out.println(tspNum + " teaspoon(s) is equal to " + convertTspToC(tspNum) + " cups.\n");
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			// Sub-Menu: Distance Conversions
			case 2:
				// Distance Conversions
				System.out.println("*******************************");
				System.out.println(" SUB-MENU: DISTANCE CONVERSION");
				System.out.println("*******************************");
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
					System.out.println(ftNum + " foot/feet is equal to " + convertFtToM(ftNum) + " meters.\n");
					break;
				case 2:
					// Miles to Kilometers
					System.out.println("Please enter number of miles: ");
					mileNum = sc.nextDouble();
					System.out.println(mileNum + " mile(s) is equal to " + convertMiToKm(mileNum) + " kilometers.\n");
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			// Quit
			case 3:
				System.out.println("*************************");
				System.out.println(" Quit selected. GOODBYE.");
				System.out.println("*************************");
				break;
				
			default:
				System.out.println("********************************************************");
				System.out.println(" WARNING: Invalid option. Please select another option.");
				System.out.println("********************************************************");
			}
		}
					
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
