//WAP to display only the strings which has character 'a' in it from the given string array.
package String;

public class a_check_StringArray {

	public static void main(String[] args) {

		String[]s= {"za","abc","xyzwer","bqb","bac","absent","zzza"};
		
		   for (int i = 0; i < s.length; i++) {
				
				String s1 = s[i];
				
				for (int j = 0; j < s1.length() ; j++) {
					
					if (s1.charAt(j)=='a') {
						System.out.println(s1);
					     }
					}				
			   }
	}

}
