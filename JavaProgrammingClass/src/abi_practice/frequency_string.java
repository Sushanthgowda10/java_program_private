package abi_practice;

public class frequency_string {
	public static void main(String[] args) {
String str="hi how are you world";
int[] freq=new int[str.length()];
int flag=-1;
char string[]=str.toCharArray();
for(int i=0;i<string.length;i++)
{
	int count=1;
	for(int j=i+1;j<string.length;j++)
	{
		if(string[i]==string[j])
		{
			count++;
			freq[j]=flag;
		}
	}
	if(freq[i]!=flag)
	freq[i]=count;
}
for(int i=0;i<freq.length;i++)
{
	if(string[i]!=' '&&freq[i]!=flag)
	System.out.print(string[i]+""+freq[i]);
}
	}

}
