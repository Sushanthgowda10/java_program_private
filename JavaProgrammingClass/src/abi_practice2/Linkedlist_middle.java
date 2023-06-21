package abi_practice2;

import java.util.LinkedList;

public class Linkedlist_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create a linked list using the LinkedList class
	    LinkedList<String> animals = new LinkedList<>();

	    // Add elements to LinkedList
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("cow");
	    animals.add("Horse");
	    animals.add("pig");
	   
	    System.out.println("LinkedList: " + animals);
String middle = null,middle1,middle2;
	    // access middle element
	    if((animals.size())%2==0)
	    {
	    	middle2=animals.get(animals.size()/2);
	    	middle1=animals.get((animals.size()-1)/2);
	    	 System.out.println("Middle Elements: " + middle1+" "+middle2);
	    	
	    }
	    else
	    {
	    	
	         middle = animals.get(animals.size()/2);
	    System.out.println("Middle Element: " + middle);
	    }
	}

}
