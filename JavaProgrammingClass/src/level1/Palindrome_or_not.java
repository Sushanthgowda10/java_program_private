package level1;

public class Palindrome_or_not {

	public static void main(String[] args) {

		int num=12321;
		int num1=num;
		
		int ld;
		int reverse=0;
		
		while (num>0) {
			ld=num%10;
			reverse=(10*reverse)+ld;
			num=num/10;
		}
		if(reverse==num1)
		{
			System.out.println(num1+" is a Palindrome number");
		}
		else
		{
			System.out.println(num1+" is a Not Palindrome number");
		}
	}

}
