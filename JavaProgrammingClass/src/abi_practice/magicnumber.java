package abi_practice;

public class magicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=163;
int sum=0;
while(n>0||sum>9)
{
	if(n==0)
	{
		n=sum;
		sum=0;
	}
	sum+=n%10;
	//new added
	n/=10;
}
if(sum==1)
	System.out.println("Magic number");
else
	System.out.println("Not a magic number");

	String str="100";
	int a=20;
	int i=Integer.parseInt(str);  
	int out=a+i;
	System.out.println(out);
	}

}
