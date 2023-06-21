package pattern;

public class Pattern2 {

	public static void main(String[] args) {
	   int n=5;
	   int a=1;
	   for(int i=0; i<n; i++)
	   {
           for(int j=0; j<(i*2)+1; j++)
           {
        	   if (j%2==0) 
        	   {
				System.out.print(a);
				a++;
			   }
        	   else
        	   {
        		   System.out.print("*");
        	   }
           }
           System.out.println();
           a=1;
	   }
    
	}
}
