package String;

public class NoOfCharacter_inEachWord {

	public static void main(String[] args) {
      
		String s = "how are you buddy";
		
		String[] ch = s.split(" ");
		
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println("No. of characters in '"+ch[i]+ "' is : "+ ch[i].length());
			
		}
		
	}

}
