package day22_Lab3_String_Class;

public class Question_5 {

	public static void main(String[] args) {
		/*
		 * Given a string of even length, return the first half. So the string
"WooHoo" yields "Woo".
firstHalf("WooHoo") --> "Woo"
firstHalf("HelloThere") --> "Hello"
firstHalf("abcdef") --> "abc"
		 */
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("WooHoo"));
		
		
	}
	public static String firstHalf(String str) {
		
		return str.substring(0, (str.length()/2));// o dan baþlar ve yarýsýný yazdýrýr
	}
	
	public static String secondHalf(String str) {
		return str.substring(str.length()/2);// ikinci yarýsýný yazdýrýr
	}

}
