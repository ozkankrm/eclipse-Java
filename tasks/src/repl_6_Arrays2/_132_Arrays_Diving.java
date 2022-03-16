package repl_6_Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class _132_Arrays_Diving {

	public static void main(String[] args) {
		/*
		 * In the sport of diving, seven judges award a score between 0 and 10, where each score
		 *  may be a floating-point value. 
The highest and lowest scores are thrown out, and the remaining scores are added together. 
The sum is then multiplied by the degree of difficulty for that dive. 
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to 
determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
output: Enter score for judge 1:
input: 1
output: Enter score for judge 2:
input: 5
output: Enter score for judge 3:
input: 5
output: Enter score for judge 4:
input: 5 
output: Enter score for judge 5:
input: 5
output: Enter score for judge 6:
input: 8
output: Enter score for judge 7:
input: 9
output: Enter difficulty:
input: 2.1
output: Total: 35.28
		 */
		
		
		 Scanner input = new Scanner(System.in);
		    float[] score = new float[7];
		    //WRITE YOUR CODE HERE
		    int sum =0;
		    int i = 0;
		    while(i<7) {
		    	
		    	System.out.println("Enter score for judge "+ (i+1) +":");
		    	score[i] = input.nextFloat();
		    	i++;
		    }
		    
		   
		    Arrays.sort(score);// order
		    for(int j=1; j<score.length-1; j++) {//didn't take small and big
		    	sum += score[j];
		    }
		    
		    System.out.println("Enter difficulty:");
		    float difficulty = input.nextFloat();
		     
		    float total = (float) (sum*0.6*difficulty);
		    
		    // FINAL OUTPUT
		    System.out.printf("Total: %.2f", total);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
