package level1;

public class Reverse_number {

	public static void main(String[] args) {

		int num=12345;
		
		int ld=0;
		int reverse=0;
		while (num>0) {
			ld=num%10;
			reverse=(10*reverse)+ld;
			num=num/10;
		}
		System.out.println(reverse);
	}

}
