package String;

public class Uppercase_to_Lowercase2 {

	public static void main(String[] args) {

		String s="ABCdefghIJ";
		char[]ch=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);          //'a' - 'A'=97-65=32
			}
			else {
				ch[i]=(char)(ch[i]-32);
			}
		}
		s=new String(ch);
		System.out.println(s);
	}

}
