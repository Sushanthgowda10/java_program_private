package level1;

public class PerfectNum2 {

	public static boolean perfectOrNot(int num)
	{
		int sum=0;
		for (int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
		    return true;	
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
	   boolean result = perfectOrNot(6);
	   if(result) {
	   System.out.println("It is a Perfect Number");
	   }
	   else {
	   System.out.println("It is not a Perfect Number");
	   }
	}
}
