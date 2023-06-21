//ASCII values : '0'=48, '1'=49, '2'=50 etc..
package String;

public class PrintNumberSum {
	
	public static void main(String[] args) {
        String s = "Ab c14 de31";
        
        char[] ch = s.toCharArray();
        
        int sum=0;
        
        for (int i = 0; i < ch.length; i++) {
       	 
       	 if (ch[i]>='0' && ch[i]<='9') {
       		 
				sum=sum+ch[i]-48;  //48 is ASCII value of '0'
			}	
		}
      System.out.println(sum);
	}
}

