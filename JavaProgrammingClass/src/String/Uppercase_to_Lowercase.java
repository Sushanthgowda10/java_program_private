//WAP to convert lowercase letters into uppercase and uc into lc in a given string.
package String;

public class Uppercase_to_Lowercase {

	public static void main(String[] args) {

		String s="ABCdefghi";
		
		char[] ch = s.toCharArray();
		char[]ch1=new char[ch.length];
		for (int i = 0; i < s.length(); i++) {
			
			if (ch[i]>='a' && ch[i]<='z') {
				String s2 = s.toUpperCase();
				ch1=s2.toCharArray();
				System.out.print(ch1[i]);
			}
			else if (ch[i]>='A' && ch[i]<='Z') {
				String s3 = s.toLowerCase();
				ch1=s3.toCharArray();
				System.out.print(ch1[i]);
			}	
		}
		
	}

}
