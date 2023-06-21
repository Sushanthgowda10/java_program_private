package abi_practice;

public class count_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=0;
String s="Greek";
char c='e';
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==c)
		res++;
}
System.out.println(res);
	}

}
