package repl_5_Arrays;

import java.util.Scanner;

public class Arrays_CountOfEvenNumber_116 {

	public static void main(String[] args) {
		/*
		 * Given an array nums, calculate the count of even numbers in nums and print out to console.

nums - [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) - 6
nums - [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) - 5
nums - [1, 1,21,21,25,13, 17, 29, 11,3])  - 0
		 */

		 Scanner input = new Scanner(System.in);
		    int[] nums = new int[10];
		    for(int i = 0 ; i<=9 ; i ++){
		      nums[i] = input.nextInt();
		    }
		     // above code will ask user 10 numbers while creating an array 
		    // just assume that you have int array with 10 numbers and start working on requirement
		    // loop through the array and get the count of the even numbers
		    //TODO: Write your code below
		    
		    int count = 0;
		    for(int i=0; i<nums.length; i++) {
		    	
		    	if(nums[i]%2==0 || nums[i]==0) {
		    		
		    		count++;
		    	}
		    }
		  System.out.println(count);  
		    
	}

}
