package level1;

public class ArmStrong_range {

	public static void main(String[] args) {

		test(1,500);
	}

	public static void test(int a, int b) {

		for (int i = a; i <= b ; i++) {
			int num=i;
			int num1=num;
			int count=0;
			int sum=0;
			while (num1>0) {
				count++;
				num1=num1/10;
			}
			num1=num;
			while (num1>0) {
				int x=num1%10;
				sum=sum+power(x,count);
				num1=num1/10;
			}
			if (sum==num) {
				System.out.println(num+" is an Armstrong number");
			}
			sum=0;
		}
	}

	public static int power(int x, int count) {

		int result=1;
		for (int i = 0; i < count; i++) {
			result=result*x;
		}
		return result;
	}
}
