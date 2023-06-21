package array2D;

import java.util.Scanner;

public class Row_wise_Sum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rows : ");
		int row=s.nextInt();
		System.out.println("Enter Columns : ");
		int col=s.nextInt();
		
		int[][]a=new int[row][col];
		
		System.out.println("Enter elements of the matrix : ");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.println("Enter row: "+i+"  column: "+j+"  value");
				a[i][j]=s.nextInt();
			  }
		}
			
		System.out.println("Rowwise sum of elements of the matrix are : ");
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				 sum=sum+ a [i][j];
			  }
		  System.out.println("Sum of Elements of ROW "+	i +" : "+sum);
		  sum=0;
         }
 int hw;		
	}
}


//WAP to display rowwise largest number in the matrix
//WAP to display columnwise least element or smallest element in the matrix

/*WAP to elements of the matrix in clockwise spiral order  
i/p: 1 2 3
     4 5 6
     7 8 9 
     
o/p: 1 2 3 6 9 8 7 4 5   */
