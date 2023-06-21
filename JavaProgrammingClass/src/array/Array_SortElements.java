package array;

public class Array_SortElements {

	public static void main(String[] args) {
    
		int[]a= {6,5,1,2,3,17,4,88,0};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]>a[j]) {
					
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}	
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
