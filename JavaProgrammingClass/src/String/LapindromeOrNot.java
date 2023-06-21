//WAP to check whether a string is Lapindrome or not
//Lapindrome is defined as a string which when split into 2 halves gives same number of characters with same frequency.
package String;

import java.util.Scanner;

public class LapindromeOrNot {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = s.nextLine();
		s1=s1.toLowerCase();
		
		boolean a = isLapindrome(s1);
		if (a) {
			System.out.println("Entered String is Lapindrome ");
		}
		else
			System.out.println("Not a Lapindrome ");
		
	}

	public static boolean isLapindrome(String s1) {
		int[]a1=new int[26];
		int[]a2=new int[26];			
/*      	for (int i = 0; i < s1.length()/2; i++) {
				a1[s1.charAt(i)-'a']++;	
		}
			for (int i = (s1.length()/2); i < s1.length(); i++) {
				a2[s1.charAt(i)-'a']++;
			}                                    */
		
		for (int i = 0, j=s1.length()-1 ; i < j ; i++, j--) {
			a1[s1.charAt(i)-'a']++;
			a2[s1.charAt(j)-'a']++;
		}
		
		    for (int i = 0; i < a1.length; i++) {
			   if (a1[i]!=a2[i]) {
				 return false;
			    }
		    }
			
		return true;
	}
}

