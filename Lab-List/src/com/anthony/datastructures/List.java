package com.anthony.datastructures;

public class List {
	// Create array
	private String[] elements = new String[8];
	
	// Get element(s)
	public String get(int index) {
		return this.elements[index];
	}
	
	// Set element(s)
	public void set(int index, String value) {
		this.elements[index] = value;
	}
	
	// Add method
	public int add(String value) {
		int index = -1;
		
		// If there is already a null element in the array, assign value at the index
		for (int i = 0; i < elements.length; i++) {
			if (null == elements[i]) {
				elements[i] = value;
				return i;
			}
		}
		
		// If here then we need to increase the size of the elements array
		String[] temp = new String[elements.length*2];
		
		for (int i = 0; i < elements.length; i++) {
			temp[i] = elements[i];
		}
		
		// Add in new value
		index = elements.length;
		temp[elements.length] = value;
		
		// Copy temp to elements variable
		elements = temp;
		
		return index;
	}
	
	// Remove method
	public String remove() {
		int index = -1;
		String value = "";
		
		// Loop through list backwards and remove last element
		for (int i = elements.length-1; i >= 0; i--) {
			if (null != elements[i]) {
				index = i;
				value = elements[i];
				elements[i] = null;
				break;
			}
		}
		
		// Return early if index is still -1 (empty list)
		if (index == -1) {
			return value;
		}
		
		// Check if we need to decrease the size of the elements array
		if (index % 8 == 0 && elements.length > 8 && elements.length > index) {
			String[] temp = new String[index];
			
			for (int i = 0; i < temp.length; i++) {
				temp[i] = elements[i];
			}
			
			// Copy temp to elements variable
			elements = temp;
		}
		
		return value;
	}
}
