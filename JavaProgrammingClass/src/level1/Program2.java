package level1;

public class Program2 {

	public static void main(String[] args) {
		int num=1222345698;
		int num1=num;
		int ld;
		int sumEven=0;
		int sumOdd=0;
		while(num>0)
		{
			ld=num%10;
			if (ld%2==0)
			{
				sumEven=sumEven+ld;
			}
			else
			{
				sumOdd=sumOdd+ld;
			}
			num=num/10;
		}
		System.out.println("Sum of even digits in "+num1+" is "+sumEven);
		System.out.println("Sum of odd digits in "+num1+" is "+sumOdd);
	}

}
