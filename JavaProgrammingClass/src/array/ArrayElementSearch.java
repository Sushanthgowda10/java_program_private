package array;

public class ArrayElementSearch {

	public static void main(String[] args) {
       int[]a= {1,5,7,9,3};
       int toFind=7;
       int b=1;
       
       for (int i = 0; i < a.length; i++) 
       {
		if (a[i]==toFind) 
		  {
			b=2;
			System.out.println("Present");
			break;	
		  }
	   }
       
       if(b==1)
         {
    	   System.out.println("Not present");
         }
	}

}
