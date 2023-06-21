package abi_practice;

public class closest_palindrome {

	public static boolean isPalindrome(int num)
	{
		int copy=num;
		long rev=0;
		while(num!=0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		if(copy==rev)
		{
			return true;
		}
		else
			return false;
	}
	public static void closet(int num)
	{
		int l=num-1;
		while(isPalindrome(l)==false)
		{
			l--;
		}
		int r=num+1;
		while(isPalindrome(r)==false)
		{
			r++;
		}
		if(Math.abs(num-l)<Math.abs(num-r))
		{
			System.out.println(l);
		}
		else
			System.out.println(r);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=169;
		closet(n);
		
	}

}
