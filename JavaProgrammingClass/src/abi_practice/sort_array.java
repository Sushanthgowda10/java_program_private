package abi_practice;

import java.util.Arrays;

public class sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {9,1,5,4};
int temp=0;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			 temp=a[i];
			a[i]=a[j];
			a[j]=temp;	
		}
	}
	System.out.println(a[i]);
}
Arrays.sort(a);   
System.out.println(Arrays.toString(a));



	}

}
