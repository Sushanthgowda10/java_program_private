package pattern;

public class Pattern8 {

	public static void main(String[] args) {
		  int n=3; //total rows
			int space=2; //total no. spaces in 1st row
			int star=1; //total no. stars in 1st row
			
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<space ; j++)
				{
					System.out.print(" ");
				}
				for(int k=0; k<star; k++)
				{
					System.out.print("*");
				}
			  System.out.println(" ");
			  space--;
			  star=star+2;
			}
	}

}
