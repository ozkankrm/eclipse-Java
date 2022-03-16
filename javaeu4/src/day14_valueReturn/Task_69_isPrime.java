package day14_valueReturn;

public class Task_69_isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
		A prime number is a number that is evenly divisible only by itself and 1. For example,
		the number 5 is prime number because it can be evenly divided only by 1 and 5. The
		number 6, however, is not prime number because it can be divided evenly by 1,2,3,and
		6.
		Write a method named isPrime which takes an integer as an argument and returns true if
		the argument is a prime number, or false otherwise.
		• Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all
		the other even numbers can be divided by 2
*/

//		famous interview question
//		explain
	
		int number = 4;
		
		if(isPrime(number)) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}
		
	isPrime(36)	;
		
	}
	
	public static boolean isPrime(int number) {
	
		boolean flag = true;
		
		if (number==0 || number==1) {
			//false
			flag = false;
			
		}else {
			
			for(int i=2; i<number; i++) { //girilen sayý 2 den baþlayarak ve artarak
										// sýrayla her sayýyý deniyor bölünyor mu diye	
				if(number%i==0) {		// eðer bölünürse prime(asal sayý deðil)
					//false				// ve bölünürse break ile burdan bitiriyor
					
					flag = false;
					break;
				}
			}
		}
		//true
		return flag;
	}
	 

}











