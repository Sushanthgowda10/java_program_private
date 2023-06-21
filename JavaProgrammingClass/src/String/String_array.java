//WAP to print only the Strings which are starting with lower case 'a' from the given String array. (String[]s={"abc","xyz","abb"};)

package String;

public class String_array {

	public static void main(String[] args) {

		
		String[]s= {"za","abc","xyz","abb","bac","absent","a"};
		
		for (int i = 0; i < s.length; i++) {
			
			String s1 = s[i];
			
			if (s1.indexOf('a')==0) {
				
				System.out.println(s1);
				
			    }
		}
	}
}

