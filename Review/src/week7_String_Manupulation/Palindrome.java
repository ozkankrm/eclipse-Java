package week7_String_Manupulation;

public class Palindrome {

	public static void main(String[] args) {
		
//		handles even and odd
//		dad  3/2  1
//		anna 4/2  2
		
//		racecar
//		0 r != r
//		1 a != a
//		2 c != c
//		3 -> 7/2 = 3 <3 --> loop stop 
		
		
		System.out.println(isPalindrome("mom"));
		
	}
	
	public static boolean isPalindrome(String str) {
		
		for(int i=0; i< str.length()/2; i++) {
			
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				
				return false;
			}
			
		}
		return true;
	}

}
