package repl_it.repl2;

import java.util.Scanner;

public class SliceNumber_107 {

	public static void main(String[] args) {
	
		/*
		 * In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5
Use / and % operators
		 */
		
		 int num, digit1, digit2, digit3, digit4, digit5;
		    //WRITE YOUR CODE HERE
		 
//		 25 --> 2 , 5 --> 20+5 -->2*10 + 5
//		 345 --> 3*100 + 4*10 + 5
//		 12345-->1*10000 + 2*1000 + 3*100 + 4*10 + 5
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter your number:");


		    
		    num= scan.nextInt();
		    
		   digit1 = num/10000; // birinci rakamı basamak değerine bölürsek buluruz
		   digit2 = (num/1000)%10; // ikinciyi basamak değrine bölürp sonra 10 ile remain yaptık
		   digit3 = (num/100)%10;// üçüncüyü basamak değerine böl ve 10 ile kalanı al
		   digit4 = (num/10)%10; // 4. basamak değerine böl ve10 ile kalanı al
		   digit5 = num%10; // son rakam 10 ile bölümünden kalanı al
		    
		    
		    System.out.println(digit1);
		    System.out.println(digit2);
		    System.out.println(digit3);
		    System.out.println(digit4);
		    System.out.println(digit5);
		    System.out.println("**************************************");
	
		    
//	second way	
		//47589
		  digit5 = num%10; // 9-->sonrakamı bulmak için 10 ile bölümünden kalanı yapdık
		  num = num/10; // 4758-->rakamı 10 a böldük bölümü aldık
		  digit4 = num%10; // 8 --> diğer basamaklarda aynı şekilde devam etti
		  num = num/10;	//475
		  digit3 = num%10; // 5
		  num = num/10; //47
		  digit2 = num%10; //7
		  num = num/10; //4
		  digit1 = num%10; //4

		  System.out.println(digit1);
		    System.out.println(digit2);
		    System.out.println(digit3);
		    System.out.println(digit4);
		    System.out.println(digit5);
		
		
		
		
		
		
		
	}

}
