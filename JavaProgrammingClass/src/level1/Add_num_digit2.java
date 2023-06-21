//2531 //52+35+13=100
package level1;

public class Add_num_digit2 {

	public static void main(String[] args) {

		int num=2531;
		int ld1,ld2;
		int sum=0;
		int b;
		while (num>9)
		{
			ld1=num%10;
			num=num/10;
			ld2=num%10;
			b=(ld1*10)+ld2;
			sum=sum+b;
		}
		System.out.println(sum);
	}
}
