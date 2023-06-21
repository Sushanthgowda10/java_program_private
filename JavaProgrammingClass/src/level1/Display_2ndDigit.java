package level1;

public class Display_2ndDigit {

	public static void main(String[] args) {

		int num=21564;
		int num1=num;
		
		while (num>99) {
			num=num/10;
		}
		num=num%10;
		System.out.println("2nd digit of "+num1+" is "+num);
	}

}
