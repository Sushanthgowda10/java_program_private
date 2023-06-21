package level1;

public class PerfectNumRange {

	public static void rangePerfect(int a,int b)
	{
		int sum=0;
		
		for(int i=a;i<=b;i++)
		{
		
		   for (int j=1;j<=i/2;j++)
		   {
			   if(i%j==0)
			   {
				sum=sum+j;
			   }
		   }
		
		    if(sum==i)
	     	{
	    	System.out.print(i+", ");	
		    }
		    
		sum=0;
	    }	
}

	public static void main(String[] args) {
	   rangePerfect(1,10000);

	}

}
