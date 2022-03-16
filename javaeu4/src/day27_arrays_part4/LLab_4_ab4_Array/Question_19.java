package day27_arrays_part4.LLab_4_ab4_Array;

public class Question_19 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints the total of the numbers in the
array, except ignore sections of numbers starting with a 6 and extending to the
next 7 (every 6 will be followed by at least one 7).
int[] x = {1,2,2} = > 5
int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
int[] a = {1,1,6,7,2} = > 4
int[] b = {1,1,6,2} = > 2
int[] c = {1,2,2,6,99,99,7,3,4} = > 12
		 */

		int[] x = {1,2,2};
		int[] y = {1, 2, 2, 6, 99, 99, 7}; 
		int[] a = {1,1,6,7,2};
		int[] b = {1,1,6,2};
		int[] c = {1,2,2,6,99,99,7,3,4};
		
		System.out.println(ignorebetween67(x));
		System.out.println(ignorebetween67(y));
		System.out.println(ignorebetween67(a));
		System.out.println(ignorebetween67(b));
		System.out.println(ignorebetween67(c));
	
	}
	public static int ignorebetween67(int [] arr) {
		
		int sum = 0;
		boolean boolCheckSix = false;
		
		for(int i=0; i<arr.length; i++) {
			
			if(boolCheckSix) {// burasý þuan false, içine girebilmesi için true olmasý lazým
				
				if(arr[i] == 7) {
					
					boolCheckSix = false;
				}
				
			}else if(arr[i] == 6) {// burasý true olduðunda baþtaki if e gider ve ordaki elementleri check eder
								   // arr[i] ==7 olduðunda içe girer ve false olur sonra ordan çýkar
				boolCheckSix = true;
			}else {
				
				sum += arr[i];
			}
			
			
		}
		return sum;
		
	}
	

}
