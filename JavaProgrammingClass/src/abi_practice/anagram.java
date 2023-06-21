package abi_practice;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="keep";
String s2="peek";
boolean status=true;
if(s1.length()!=s2.length())
{
	status=false;
}
else
{
	char[] a1=s1.toLowerCase().toCharArray();
	char[] a2=s2.toLowerCase().toCharArray();
	Arrays.sort(a1);
	Arrays.sort(a2);
	status=Arrays.equals(a1, a2);
}
if(status)
{
	System.out.println("Anagram");
}
else
	System.out.println("Not Anagram");
}
}
