package abi_practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class map_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a hashmap
	    Map<String, String> languages = new HashMap<>();
	    languages.put("3", "JS");
	    languages.put("1", "Java");
	    languages.put("2", "Python");
	    languages.put("0", "hi");
	    System.out.println("Map: " + languages);
	    for(Entry<String, String> entry:languages.entrySet())  
	    {  
	    //getting keys and values using method  
	    System.out.println(entry.getKey() + " = " +entry.getValue());  
	    }  
	    // create a tree map from the map
	    TreeMap<String, String> sortedNumbers = new TreeMap<>(languages);
	    System.out.println("Map with sorted Key" + sortedNumbers);
	}

}
