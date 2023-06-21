package array;

import java.util.Scanner;

public class Array_DuplicateArray_Scanner {

	public static void main(String[] args) {
		int[]a=readArray();
		int[]b=duplicateArray(a);
		
		System.out.println("Elements of Duplicate Array : ");
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}      
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
	public static int[] duplicateArray(int[]a)
	{
		int[]b=new int[a.length];
		
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=a[i];
		}
		return b;
	}
}
