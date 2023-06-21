package level1;

public class Fibonacci_Series {

	public static void main(String[] args) {

		int terms=15;
		fibo_series(terms);
	}

	private static void fibo_series(int n) {

		int f1=0,f2=1;
		if (n<=0) {
			System.out.println("terms must be greater than 0");
		}
		else if (n==1) {
			System.out.print(f1);
		}
		else if (n==2) {
			System.out.print(f1+","+f2);
		}
		else {
			System.out.print(f1+","+f2);
			int f;
			int i=3;
			while (i<=n) {
				f=f1+f2;
				System.out.print(","+f);
				f1=f2;
				f2=f;
				i++;
			}
		}
	}
}
