package abi_practice;

public class armstrong {

	public static void main(String[] args) {
		  int number = 371, originalNumber, remainder, result = 0,digits=0;
	        originalNumber = number;
			while(originalNumber != 0)    
            {   
                originalNumber = originalNumber/10;   
                digits++;   
            }   
			originalNumber = number;
	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, digits);
	            originalNumber /= 10;
	        }
	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }

}
