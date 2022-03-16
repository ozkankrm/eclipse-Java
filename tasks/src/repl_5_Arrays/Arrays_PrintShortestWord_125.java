package repl_5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_PrintShortestWord_125 {

	public static void main(String[] args) {
		/*
		 * Write a program that will print the shortest word in the given array str. 

			input: java, cable, red, vivid, remedy, grace
			output: red
		 */

		  Scanner scan = new Scanner(System.in);
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		    
		   
		    
		    String shortestWord = str[0]+1;
			
			for(int i=0; i<str.length; i++) {
				
				if(str[i].length() < shortestWord.length() ) {
					
					shortestWord = str[i];

				}		
			}
			System.out.println(shortestWord);
			
	}	
}
