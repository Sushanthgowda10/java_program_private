package abi_practice;

public class PalindromeString {
	static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input string
        String str = "geeks";
 
        // passing bool function till holding true
        if (isPalindrome(str))
 
            // It is a palindrome
            System.out.print("Yes");
        else
 
            // Not a palindrome
            System.out.print("No");
	}

}
