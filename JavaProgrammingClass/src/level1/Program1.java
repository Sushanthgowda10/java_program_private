package level1;

public class Program1 {

	public static void main(String[] args) {
		int num=1251;
		int num1=num;
		int ld;
		int sum=0;
		while(num>0)
		{
			ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println("Sum of digits in "+num1+" is "+sum);
	}
}
