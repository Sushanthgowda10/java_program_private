package array2D;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_arraylist {

	public static void main(String[] args) {

		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		Iterator<Integer> i=a1.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
