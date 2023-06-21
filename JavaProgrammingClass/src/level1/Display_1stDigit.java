package level1;

public class Display_1stDigit {

	public static void main(String[] args) {

		int num=2564;
		
		int num1=num;

		while (num>9)
		{
			num=num/10;
		}
		System.out.println("First digit of "+num1+ " = "+num);
	}

}
