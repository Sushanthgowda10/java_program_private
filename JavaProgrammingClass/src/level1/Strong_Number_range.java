package level1;

public class Strong_Number_range {

	public static void main(String[] args) {

		int a=1;
		int b=500;
		
		
		int sum=0;
		int ld;
		int temp,num;
		for(int i=a;i<=b;i++)
		{
			temp=i;
			num = temp;
			 
		while (temp>0) {
			ld=temp%10;
			sum=sum+Factorial(ld);
			temp=temp/10;
		   }
		if (num==sum) {
			System.out.println(num+" is a Strong Number");
		   }
		sum=0;
		}
	}

	public static int Factorial(int ld) {

		int fact=1;
		for (int i = ld; i >0 ; i--) {
			fact=fact*i;
		}
		return fact;
	}

}
