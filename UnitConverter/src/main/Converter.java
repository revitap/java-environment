package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		int menuSelection = 0;
		
		while (menuSelection != 4) {
			System.out.println("Please select an option:\n");
			System.out.print("1. Cups To Teaspoons\n");
			System.out.print("2. Miles To Kilometers\n");
			System.out.print("3. US Gallons to Imperial Gallons\n");
			System.out.print("4. Quit");
			
			menuSelection = input.nextInt();
			
			switch(menuSelection) {
			
			case 1: 
				// Cups to Teaspoons
				int cupNum, tspNum;
				System.out.println("Please enter number of cups: ");
				cupNum = input.nextInt();
				tspNum = cupNum * 48;
				System.out.println(cupNum + " cups is equal to " + tspNum + " teaspoons\n");
				break;
				
			case 2:
				// Miles to Kilometers
				double mileNum, kilometerNum;
				System.out.println("Please enter number of miles: ");
				mileNum = input.nextInt();
				kilometerNum = mileNum * 1.609344;
				System.out.println(mileNum + " miles is equal to " + kilometerNum + " kilometers\n");
				break;
				
			case 3:
				//US Gallons to Imperial Gallons
				double usgNum, igNum;
				System.out.println("Please enter number of US gallons: ");
				usgNum = input.nextInt();
				igNum = usgNum * 0.83267382;
				System.out.println(usgNum + " US gallons is equal to " + igNum + " Imperial gallons\n");
				break;
				
			case 4:
				System.out.println("Quit selected. Goodbye.");
				break;
				
			default:
				System.out.println("Invalid option. Please select options 1 through 4.");			
			}
		}
	}
}