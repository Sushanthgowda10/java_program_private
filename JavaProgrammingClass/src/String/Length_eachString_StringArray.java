//WAP to display length of each string present in the string array.
package String;

public class Length_eachString_StringArray {

	public static void main(String[] args) {

		String[]s= {"za","abc","xyzwer","abqb","bac","absent","a"};
		
         for (int i = 0; i < s.length; i++) {
			
			String s1 = s[i];
			
			System.out.println("Length of '"+s1+"' is "+s1.length());
			
		}
	}

}

