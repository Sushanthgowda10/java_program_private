
package abi_practice;

public class reverse_specialchar {
	public static void reverse(char str[])
	{
		int r=str.length-1;
		int l=0;
		while(l<r)
		{
			if(!Character.isAlphabetic(str[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(str[r]))
			{
				r--;
			}
			else
			{
				char temp=str[l];
				str[l]=str[r];
				str[r]=temp;
				l++;
				r--;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hi World!@s Ho&*w";
char[] ch=str.toCharArray();
reverse(ch);
String revstr=new String(ch);
System.out.println(revstr);
String strr="#$%^&fgh7678$%^gdhetydDFGH";
String str1 = strr.replaceAll("[^a-zA-Z0-9]", "");  
System.out.println(str1); 

	}

}
