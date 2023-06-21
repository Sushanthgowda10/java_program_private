package array;

import java.util.Scanner;

public class Array_AddElementToArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int[]a=readArray();
		System.out.println("Enter value to be inserted : ");
		int value=s.nextInt();
		System.out.println("Enter index : ");
		int index=s.nextInt();
		
	int[]b=insertValue(a,value,index);
		
		System.out.println("Elements of Array after inserting value : ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}		
}   

     public static int[] insertValue(int[] a, int value, int index) {
    	 
    	 int[]b=new int[a.length+1];
    	 for (int i = 0; i < index; i++) {
			b[i]=a[i];
		}
    	 
    	 b[index]=value;
    	 
    	 for (int i = index+1; i < b.length; i++) {
			b[i]=a[i-1];
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
     