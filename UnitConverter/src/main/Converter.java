
package main;

public class Converter {

	public static void main(String[] args) {
		// 1. create int variable named menuSelection
		int menuSelection;
		
		// Display menu items
		menuSelection = Keyin.inInt("Please select an option:");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
		
		// Switch
		switch (menuSelection) {
		case 1: 
			System.out.println("Option 1 selected");
			break;
		case 2:
			System.out.println("Option 2 selected");
			break;
		case 3:
			System.out.println("Option 3 selected");
			break;
		case 4:
			System.out.println("Quit selected. Goodbye.");
			break;
		default:
			System.out.println("Invalid selection");
		
		
		
		// 2. create while loop w/condtion
		//while (menuSelection != /*last menu option */){
			// 2.1. print menu
//			System.out.println("Please select an option:\r\n"
//					+ "1. Cups to Teaspoons\r\n"
//					+ "2. Miles to Kilometers\r\n"
//					+ "3. US Gallons to Imperial Gallons\r\n"
//					+ "4. Quit");  // print menu
//		while (on) {
//			System.out.println("Please select an option:");
//			on = false;
//			
//			// 2.2. create scanner to collect user's menuSelection
//			Scanner scanner = new Scanner(System.in);
			
			// 2.3. create switch to collect user's qty of first unit, convert to second unit, and print output
			
		}
		
		

	}

}
