package array2D;

import java.util.Scanner;

public class Program1 {

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
			
		System.out.println("Elements of the matrix are : ");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.print(a[i][j]+ " ");
			  }
		  System.out.println();
         }
	}
}


