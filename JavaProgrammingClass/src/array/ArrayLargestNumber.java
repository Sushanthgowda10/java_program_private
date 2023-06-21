package array;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		int[]a= {33,1,9,3,6,11,25,1,8};
		int largest=a[0];
		 for (int i = 1; i < a.length; i++) 
		 {
			if(largest<a[i])
			{
				largest=a[i];
			}
		 }
		System.out.println(largest); 

	}

}
