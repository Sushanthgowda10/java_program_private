package abi_practice;

public class reverse_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Hi World";
String s[]=a.split(" ");
String ans="";
for(int i=s.length-1;i>=0;i--)
{
	ans+=s[i]+" ";
}
System.out.println("count of words:-"+s.length);
System.out.println(ans);
	}

}
