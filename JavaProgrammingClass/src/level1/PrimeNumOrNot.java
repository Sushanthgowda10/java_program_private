package level1;

public class PrimeNumOrNot {

	public static void main(String[] args) {

		Isprime(3);
		Isprime(4);
		Isprime(11);
		Isprime(21);
	    Isprime(5);	
	}

	public static void Isprime(int a) {
       int c=0;
       for (int i = 2; i < a; i++) {
		if(a%i==0)
		{
			c=1;
			System.out.println(a+" is not a Prime number");
			break;
		}
	}
       if(c==0)
       {
    	   System.out.println(a+" is a Prime number");
       }
		
	}

}
