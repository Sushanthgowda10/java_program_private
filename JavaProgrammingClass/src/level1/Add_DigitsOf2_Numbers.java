package level1;

public class Add_DigitsOf2_Numbers {

	public static void main(String[] args) {
      
		int a=123;
		int b=356;
		int lda = 0;
		int ldb = 0;
		int sumld = 0;
		int sum = 0;
		
		while (a>0)
		{
			lda=a%10;
			ldb=b%10;
			sumld=lda+ldb;
			a=a/10;
			b=b/10;
			sum=sum+sumld;
		}
		System.out.println(sum);
	}

}
