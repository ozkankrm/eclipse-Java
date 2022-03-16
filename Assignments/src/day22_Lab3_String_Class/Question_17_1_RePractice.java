package day22_Lab3_String_Class;

public class Question_17_1_RePractice {

	public static void main(String[] args) {


		String str = "Taco cat";
		
		String dummy = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			dummy = dummy + str.charAt(i);
			
		}
//		if(str.equals(dummy)) {
//			System.out.println(true);
//		}
		
		// eðer iki word arasýnda boþluk varsa önce boþluður replace ile change et
//		eðer büyük küçük harf varsa ignorecase le ignore et
		
		if(str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
	}

}
