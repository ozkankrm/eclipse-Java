package day19_StringClass_Manipulation;

import java.util.Scanner;

public class Task_75_Length_TotalCharacter {

	public static void main(String[] args) {
		
//		Write a program that ask user to enter his/her firstname and lastname. Display in the
//		console total number of characters.

		Scanner scan = new Scanner(System.in);
		
//		first way
//		System.out.println("Enter your firstname and lastname");
//		String name = scan.nextLine();
//		
//	int x  = 	name.length();// numara cinsinden olduðu için int kullanýlýr.
//		
//		System.out.println(x); // boþluk olursa toplam harf sayýsý+boþluk sayýsý=length
//		
//		System.out.println(name.length());//seondy way write
		
//		second way
		System.out.println("Enter your firts name");
		String firstName = scan.next();
		
		System.out.println("Enter your last name");
		String lastName = scan.next();
		
		System.out.println("Your fistname and lastname total character : " +(firstName.length() +lastName.length()));
		
		
		
		
	}

}
