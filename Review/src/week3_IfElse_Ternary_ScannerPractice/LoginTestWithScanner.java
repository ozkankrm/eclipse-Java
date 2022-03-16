package week3_IfElse_Ternary_ScannerPractice;

import java.util.Scanner;

public class LoginTestWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String username = "abcd";
		String password = "secret" ;
		
		System.out.println("Enter your username and password separated by space");
		username = scan.next(); //iki kelimeyi ayný satýrda girilmesi istendi ve next biri kelime yazdýrýr ve diðeri diðerini yazdýrýr.
		password = scan.next();
		
		if (    username.equals("abcd") && password.equals("secret") ) {
			System.out.println("SUCCESSFUL!!!");
			
		}else if ( !username.equals("abcd") && !password.equals("screst")){
			System.out.println("BOTH USERNAME AND PASSWORD ARE WRONG!!");
			
		}else if (  username.equals("abcd") && !password.equals("secret") ) {
			System.out.println("USERNAME ÝS CORRECT BUT PASSWORD IS WRONG");
			
		}else if(  !username.equals("abcd")  && password.equals("secret")) {
			System.out.println("USERNAME IS WRONG BUT PASSWORD IS CORRECT");
		}
				
		
	}

}
