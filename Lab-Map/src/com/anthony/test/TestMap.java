package com.anthony.test;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "A forbidden fruit");
		dictionary.put("banana", "A yellow fruit that can be peeled");
		dictionary.put("cantaloupe", "A melon fruit that has an orange flesh");
		System.out.println(dictionary);
		
		// Get "value" from map using "key"
		String key = "apple";
		String value = dictionary.get(key);
		System.out.println("The value for the key: " + key + " is " + value);
		
		// Define a new "TreeMap"
		TreeMap<String, String> sortedDictionary = new TreeMap<>();
		
		// Use "putAll" method to add all items in "dictionary" above into "sortedDictionary" below
		sortedDictionary.putAll(dictionary);
		System.out.println(sortedDictionary); // Sorted in alphabetical order
		
		// Add another element to "sortedDictionary"
		sortedDictionary.put("beets", "An actual vegetable"); // Automatically added in alphabetical order
		System.out.println(sortedDictionary);	
		
		// Re-add an element
		sortedDictionary.put("beets", "A better explanation"); // "beets" value updated; no duplicate key
		System.out.println(sortedDictionary);
		
		// Create a Set of keys
		Set<String> keys = sortedDictionary.keySet();
		
		// Create enhanced for-loop to iterate over the keys and print them
		for(String s: keys) {
			System.out.println("key: " + s);
		}
	}
}
