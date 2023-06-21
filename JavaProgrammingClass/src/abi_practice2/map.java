package abi_practice2;

import java.util.HashMap;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring a HashMap of String keys and String values
	    HashMap<String, String> hashmap = new HashMap<String, String>();
	    // Adding key-value pairs to HashMap
	    hashmap.put("1", "Value1");
	    hashmap.put("2", "Value2");
	    hashmap.put("3", "Value3");
	    hashmap.put("4", "Value4");
	    hashmap.put("5", "Value5");
	    System.out.println(hashmap);
	    
	 // int size() method returns the number of key value pairs 
	    System.out.println("Size of HashMap : " + hashmap.size()); 
	    
	    // Checking again whether HashMap is Empty or not
	    System.out.println("Is HashMap Empty? "+hashmap.isEmpty());
	    
	    System.out.println("Iterating or looping map using foreach loop");
	    // Iterating or looping using keySet() method
	    for (String key : hashmap.keySet()) {
	        System.out.println("key: " + key + " value: " + hashmap.get(key));
	    }
	}

}
