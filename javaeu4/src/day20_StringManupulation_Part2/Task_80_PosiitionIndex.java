package day20_StringManupulation_Part2;

public class Task_80_PosiitionIndex {

	public static void main(String[] args) {
		
//	Write a method that accepts 2 strings(str1,str2) and prints the position index of the str2
//	if str2 is existing in str1.If it doesn�t exist, print �not found�
//	checkedString(�Your order confirmation number is XYZ�, �confirmation�) ;
			
		checkedString("Your orde confirmation number is XYZ", "confirmation");
	
	}
	public static void checkedString(String str1, String str2) {
		
		if(str1.contains(str2)) {
			int x = str1.indexOf(str2);
			System.out.println(x);//6
		}else {
			System.out.println("not found");
		}
		
		
	}

}
