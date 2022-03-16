package week7_String_Manupulation;

public class ABBalanced {

	public static void main(String[] args) {
		/*
		* Write a program that will accept a String and check if the a's and b's in the String are 
	 * balanced. A String is balanced whenever there is an 'a' character and somewhere later 
	 * in the String there is a 'b' character
	
	eðer a dan sonki b varsa balanced 
	yoksa not balanced
		
		ýnput : "abcab"
		output: "balanced"
		
		ýnput: "bacdf"
		output: "not balanced"
*/
		
		System.out.println(isBalanced("abcab"));
		System.out.println(isBalanced("bacdf"));
		System.out.println(isBalanced("ayeba"));
		System.out.println(isBalanced("aaxxb"));
				

	}
//	bu mantýðý iyi öðren kullanacaksýn
	public static String isBalanced(String s) {
		
		for(int i=0; i<s.length(); i++) { // i<= slength()-1
			
			if(s.charAt(i) == 'a') {
				if(!s.substring(i).contains("b")) {
					
					return "not balanced";
				}	
			}
			
		}
		return "balanced";
	}
	
	

}
