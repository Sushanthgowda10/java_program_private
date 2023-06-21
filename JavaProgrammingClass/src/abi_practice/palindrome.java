package abi_practice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12321;
		int copy=num;
		long rev=0;
		while(num!=0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		if(copy==rev)
		{
		System.out.println("Given number is pallindrome");
			}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}

}
