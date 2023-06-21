package array;

import java.util.Scanner;

public class ArraySwap2Numbers_user_input {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[]a= {4,56,78,9,0,8};
		System.out.println("Before swapping : ");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter index values : ");
		int i1=s.nextInt();
		int i2=s.nextInt();
		
		a[i1]=a[i1]+a[i2]; //a=a+b
		a[i2]=a[i1]-a[i2]; //b=a-b
		a[i1]=a[i1]-a[i2]; //a=a-b
		System.out.println("After swapping : ");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
