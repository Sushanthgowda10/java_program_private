package abi_practice;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello?2";
int count=0;
for(int i=0;i<str.length();i++)
{

	if(Character.isLetter(str.charAt(i)))
		count++;
}
System.out.println(count);
	}

}
