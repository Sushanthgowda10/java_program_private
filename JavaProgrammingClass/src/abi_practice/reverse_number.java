package abi_practice;

public class reverse_number {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Hi World";
char[] ch=a.toCharArray();
String temp="";
for(int i=ch.length-1;i>=0;i--)
{
	temp+=ch[i];
}

System.out.println(temp);
	}

}
