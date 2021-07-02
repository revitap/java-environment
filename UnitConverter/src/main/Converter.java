package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {		
			
		int menuSelection = 0;
		Scanner input = new Scanner(System.in);	
		
		while (menuSelection != 4) {
			System.out.println("***************************");
			System.out.println("UNIT CONVERTER APPLICATION");
			System.out.println("***************************");
			System.out.println("Please select an option:");
			System.out.println("1. Cups To Teaspoons");
			System.out.println("2. Miles To Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			System.out.println("Enter option: ");
			
			menuSelection = input.nextInt();
			
			switch(menuSelection) {
			
			case 1: 
				// Cups to Teaspoons
				int cupNum;
				double tspNum;
				System.out.println("Please enter number of cups: ");
				cupNum = input.nextInt();
				tspNum = cupNum * 48;
				System.out.println(cupNum + " cup(s) is equal to " + tspNum + " teaspoons.\n");
				break;
				
			case 2:
				// Miles to Kilometers
				int mileNum;
				double kilometerNum;
				System.out.println("Please enter number of miles: ");
				mileNum = input.nextInt();
				kilometerNum = mileNum * 1.609344;
				System.out.println(mileNum + " mile(s) is equal to " + kilometerNum + " kilometers.\n");
				break;
				
			case 3:
				//US Gallons to Imperial Gallons
				int usgNum;
				double igNum;
				System.out.println("Please enter number of US gallons: ");
				usgNum = input.nextInt();
				igNum = usgNum * 0.83267382;
				System.out.println(usgNum + " US gallon(s) is equal to " + igNum + " Imperial gallons.\n");
				break;
				
			case 4:
				System.out.println("Quit selected. Goodbye.");
				break;
				
			default:
				System.out.println("Invalid option. Please make another selection.\n");			
			}
		}
	}
}
