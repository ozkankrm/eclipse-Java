package day14_valueReturn;

public class ValueReturn {

	public static void main(String[] args) {
	
//		bu yöntemle bir value return yapabiliriz
	int x = sum(2, 3);
		
	System.out.println(sum(2,3)); // result=num1+num2; burda çalışıyor
		
		
	}
	
	public static int sum(int num1, int num2) {
		
		int result; // local variable
		
		result = num1+num2;
		
		return result;
		
	}

}
