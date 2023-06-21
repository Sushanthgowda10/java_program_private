package array;

public class ArrayPerfectNumberCount {
	
	public static void countOfPerfectNum(int[]a)
	{
		int count=0;
		int sum=0;
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=1; j<=a[i]/2; j++) 
			{
				if(a[i]%j==0)
				{
					sum=sum+j;
				}		
			}
	       if(sum==a[i])
		   {
			count++;
		   }
	     
	     sum=0;
	     
		}
		
	  System.out.println("Total count of Perfect Numbers in the array: "+count);
	}

	public static void main(String[] args) {
		int[]a= {3,6,10,15,20,28,36};
		countOfPerfectNum(a);
	}

}
