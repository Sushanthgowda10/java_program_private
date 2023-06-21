package String;

public class Count {

	public static void main(String[] args) {

		String s = "A B a b 123 i";
		int uc=0;
		int lc=0;
		int vc=0;
		int cc=0;
		int dc=0;
		int sc=0;
		
					
		for (int i = 0; i < s.length(); i++)
		{
			 char ch=s.charAt(i);
			 
			 if (ch>='A' && ch<='Z') {
				uc++;
				if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					vc++;
				}
				else {
					cc++;
				}
			 }
			 else if (ch>='a' && ch<='z') {
				lc++;
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vc++;
				}
				else {
					cc++;
				}
			}
			 else if (ch>='0' && ch<='9') {
				dc++;
			}
			 else if (ch==' ') {
				 sc++;
			}
		}
		System.out.println("UPPERCASE COUNT: "+uc );
		System.out.println("LOWERCASE COUNT: "+lc );
		System.out.println("VOWEL COUNT: "+vc );
		System.out.println("CONSONANT COUNT: "+cc );
		System.out.println("DIGIT COUNT: "+dc );
		System.out.println("SPACE COUNT: "+sc );
	}

}
