package level1;

import java.util.Scanner;

public class Prime_Num_Range {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter range numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        
        for (int i = a; i < b; i++) {
        	int c=0;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					c=1;
					break;
				}
			}
			if (c==0) {
				System.out.print(i+ " ");
			}
		}
		
	}
}
