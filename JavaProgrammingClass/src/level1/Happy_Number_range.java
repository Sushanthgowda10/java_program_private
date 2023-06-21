package level1;

public class Happy_Number_range {

	public static void main(String[] args) {

		for (int i = 1; i <=1000 ; i++) {
			int num=i;
			int result=num;
			while (result!=1&&result!=4) {
				result=happyNumber(result);
			}
			if (result==1) {
				System.out.println(num+" is a Happy number");
			}
		}
	}

	private static int happyNumber(int num) {

		int sum=0;
		int ld;
		while (num>0) {
			ld=num%10;
			sum=sum+(ld*ld);
			num=num/10;
		}
		return sum;
	}

}
