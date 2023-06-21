package abi_practice;

import java.util.Arrays;

public class remove_string_duplicate {
public static String remdup(char str[],int n)
{
	int index=0;
	for(int i=0;i<n;i++)
	{
		int j;
		for(j=0;j<i;j++)
		{
			if(str[i]==str[j])
			{
				break;
			}
		}
		// If not present, then add it to
        // result.
		
		if(i==j)
		{
			str[index++]=str[i];
		}
		
	}
	return (String.valueOf(Arrays.copyOf(str, index)));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char str[]="greeksforgreek".toCharArray();
int n=str.length;
System.out.println(remdup(str, n));

	}

}
