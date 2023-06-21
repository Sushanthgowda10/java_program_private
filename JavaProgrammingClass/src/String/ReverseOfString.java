package String;

public class ReverseOfString {

	public static void main(String[] args) {

		String s="vineeth abcd";
		String s1="";
		
		
		for(int i=0; i<s.length(); i++)
		{
			
			s1=s.charAt(i)+s1;
			
		}
		System.out.print(s1);
	}

}
