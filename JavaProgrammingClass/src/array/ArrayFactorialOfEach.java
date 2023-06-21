package array;

public class ArrayFactorialOfEach {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,8};
		
		int fact=1;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = a[i]; j > 0; j--) 
			{
				fact=fact*j;
			}
			System.out.println(a[i]+"! = "+fact);
			
			fact=1;
		}

	}

}
