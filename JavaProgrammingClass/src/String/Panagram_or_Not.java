//PANAGRAM is a sentence which has all 26 letters of English Alphabet.(ex:"the five boxing wizards jump quickly")
package String;

import java.util.Scanner;

public class Panagram_or_Not {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String s1 = s.nextLine();
		s1=s1.toLowerCase();
		s1=removeSpaces(s1);
        
		boolean a = isPanagram(s1);
		if (a) {
			System.out.println("Entered sentence is a Panagram");
		}
		else
			System.out.println("Not a Panagram");
	}

	public static boolean isPanagram(String s1) {

		if (s1.length()<26) {
			return false;
		}
		
		int[]a=new int[26];
		
		for (int i = 0; i < s1.length(); i++) {
			a[s1.charAt(i)-'a']++;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]==0) {
			   return false;	
			}
		}
		
		return true;
	}

	public static String removeSpaces(String s1) {

		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)!=' ') {
				s2=s2 + s1.charAt(i);
			}
		}
		return s2;
	}

}

