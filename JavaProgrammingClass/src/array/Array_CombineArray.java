package array;
import java.util.Scanner;
public class Array_CombineArray {
	
	public static void main(String[] args) {
		int[]a=readArray();
		int[]b=readArray();
		int[]c=combineArray(a,b);
		
		System.out.println("Elements of Combined Array : ");
		for (int i = 0; i < c.length; i++) 
		{
		  System.out.println(c[i]); 	
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
	public static int[] combineArray(int[]a1,int[]b1) 
	{
		int[]c=new int[a1.length+b1.length];
		
		for (int i = 0; i < a1.length; i++) 
		{
			c[i]=a1[i];	
		}
		for (int i = 0; i < b1.length; i++) 
		{
			c[i+a1.length]=b1[i];
		}
		return c;
	}

}
