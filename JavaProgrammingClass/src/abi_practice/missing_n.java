package abi_practice;

public class missing_n {
	public static void missing(int[] num)
	{
		int n=num.length+1;
		int sum=(n*(n+1))/2;
		int actualsum=0;
		for(int i=0;i<num.length;i++)
		{
			actualsum+=num[i];
		}
		System.out.println(sum-actualsum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {1,2,3,4,5,6,7,9,10,11};
missing(array);

	}

}
