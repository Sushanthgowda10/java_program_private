package abi_practice;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int base = 3, exponent = 5;

		    long result = 1;

		    while (exponent != 0) {
		      result *= base;
		      exponent--;
		    }

		    System.out.println("Answer = " + result);
	}

}
