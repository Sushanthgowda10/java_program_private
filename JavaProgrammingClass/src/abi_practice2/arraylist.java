package abi_practice2;

import java.util.ArrayList;
import java.util.Collections;


public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println(al);
        //Checking value present or not
        if((al.contains(7)))
        {
        	System.out.println("Present");
        }
        else
        {
        	System.out.println("not");
        }
        //sorting
       Collections.sort(al);
       System.out.println(al);
       //reverse
       Collections.reverse(al);
       System.out.println(al);
       //remove
       al.remove(2);
        System.out.println("Using Advanced For Loop");   
        // printing ArrayList 
        for (Integer num : al) {         
            System.out.println(num);   
        }
	}

}
