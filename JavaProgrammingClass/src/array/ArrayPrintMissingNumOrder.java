package array;

public class ArrayPrintMissingNumOrder {

	public static void main(String[] args) {
		int[]a= {1,3,5,6,9,11,14};
		
		for(int i=0; i<a.length-1; i++)
		{
			for (int j=a[i]+1; j<a[i+1]; j++)
			{
				System.out.print(j+" ");
			}
		}
		
  /*	int n=a[0];  //vijesh's method
 
		for (int i = 0; i < a.length; n++) 
		{
			if(a[i]==n)
			{
				i++;
			}
			else
			{
				System.out.print(n+" ");
			}
		}        */
		
	}

}
