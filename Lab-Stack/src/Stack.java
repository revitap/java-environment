import java.util.Arrays;

public class Stack {
	
	private int lastItem = 0;
	private int[] items = new int[0];
	
	// Add items to the stack
	public void push(int newItem) {
		int index = items.length; // Get current length to store as index
		System.out.println("The array length is: " + index);
		
		items = new int[items.length + 1]; // Increase array by 1 so we can add new item
		System.out.println("items after extending the length by 1: " + Arrays.toString(items));
		
		items[index] = newItem; // Store value in index
		System.out.println("items after storing the new value: "+ Arrays.toString(items));
		
		lastItem = newItem; // Update lastItem
		System.out.println("The last item: " + lastItem);
	}
	
	// Remove items from the stack
	public int pop() {
		//return 0;
		int tempItem = lastItem; // Store the last item into a variable
		
		// Copy a new array but remove last item
		int[] newArray = new int[items.length-1];
		
		for(int i = 0; i < newArray.length; i++){
		     newArray[i] = items[i];
		}
		
		items = newArray; //update the items array
		lastItem = items[items.length-1]; //update lastItem
		
		//return our ‘popped' element
		return tempItem;
	}
	
	// View last item
	public int peek() {
		return 0;
	}
}
