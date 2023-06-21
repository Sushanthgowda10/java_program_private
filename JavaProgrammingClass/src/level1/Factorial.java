package level1;

public class Factorial {

	public static void main(String[] args) {

		int num=4;
		int num1 = num;
		int factorial=1;
		
		while (num>0) {
			factorial=factorial*num;
			num--;
		}
		System.out.println(num1+"! = "+factorial);
	}

}
