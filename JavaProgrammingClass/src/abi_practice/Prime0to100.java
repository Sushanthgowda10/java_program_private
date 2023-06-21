package abi_practice;

public class Prime0to100 {
    public static Boolean CheckPrime(int n)
    {
int flag=0;
if(n==0||n==1)
{
	flag=1;
}
else
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
		flag=1;
		break;
		}
	}
if(flag==0)
{
	return true;
}
else
{
	return false;
}
    }
    public static void main (String[] args)
    {
        for(int n=100;n>=1;n--)
        {
        if(CheckPrime(n)==true)
        {
            System.out.print(n);
        }
    }
}
}
