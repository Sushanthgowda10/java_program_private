//2531 //25+53+31=109
package level1;

public class Add_num_digit {

	public static void main(String[] args) {

		int num=2531;
		int sum=0;
		int ld;
		while (num>9)
		{
			ld=num%100;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println(sum);
	}

}
