package abi_practice2;

import java.util.HashSet;
import java.util.Iterator;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Declaring a HashSet
	    HashSet<String> hashset = new HashSet<String>();
	    // Add elements to HashSet
	    hashset.add("Pear");
	    hashset.add("Apple");
	    hashset.add("Orange");
	    hashset.add("Papaya");
	    hashset.add("Banana");  
	    
	    System.out.println(hashset);
	    // Get iterator
	    Iterator<String> it = hashset.iterator();
	    // Show HashSet elements
	    System.out.println("HashSet contains: ");
	    while(it.hasNext()) {
	    	
	      System.out.println(it.next());
	      
	    }
	    // Using for each loop
	    System.out.println("using for loop");
	    for(String str : hashset){
	        System.out.println(str);
	    }
	    
	    // Creating an Array of HashSet size
	    String[] array = new String[hashset.size()];
	    // Converting HashSet to Array using toArray() method
	    hashset.toArray(array);
	    //Showing Array elements
	    System.out.println("Array contains :");
	    for(String strr : array){
	        System.out.println(strr);
	    }
	}

}
