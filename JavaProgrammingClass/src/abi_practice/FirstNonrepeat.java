package abi_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FirstNonrepeat {
	public static Character firstNonRepeatedCharacter(String str)
	{
		Set<Character>repeatingChars=new HashSet<>();
		List<Character>nonRepeatingChars=new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			char letter=str.charAt(i);
			if(repeatingChars.contains(letter))
				continue;
			if(nonRepeatingChars.contains(letter))
			{
				nonRepeatingChars.remove((Character)letter);
				repeatingChars.add(letter);
			}
			else
			{
				nonRepeatingChars.add(letter);
			}
		}
		return nonRepeatingChars.get(0);
	}
	public static Character repeat(String str) {
		char a ='a';
		for(char i:str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				a=i;
				break;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter the input String");
@SuppressWarnings("resource")
Scanner in=new Scanner(System.in);
String s=in.nextLine();
char ch=firstNonRepeatedCharacter(s);
char ch1=repeat(s);
System.out.println(ch);
System.out.println(ch1);
	}

}
