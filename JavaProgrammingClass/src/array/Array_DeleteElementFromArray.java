package array;

import java.util.Scanner;

public class Array_DeleteElementFromArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int[]a=readArray();
		
		System.out.println("Enter index of value to be deleted : ");
		int index=s.nextInt();
		
	int[]b=deleteValue(a,index);
		
		System.out.println("Elements of Array after deleting value : ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}		
}   

     public static int[] deleteValue(int[] a, int index) {
    	 
    	 int[]b=new int[a.length-1];
    	 for (int i = 0; i < index; i++) {
			b[i]=a[i];
		}
    	 
    	 for (int i = index; i < b.length; i++) {
			b[i]=a[i+1];
		}

    	 return b;
	}

	@SuppressWarnings("resource")
	public static int[] readArray() {
     	Scanner s=new Scanner(System.in);
    	System.out.println("Enter Size of Array");
	    int size=s.nextInt();
	    int[]a=new int[size];
	
	    System.out.println("Enter elements of Array : ");
    	for (int i = 0; i < a.length; i++) 
      	{
	      a[i]=s.nextInt();	
	    } 
        return a;
       }     
}
