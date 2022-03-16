package day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_2 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and check the length of the array first.
If the length is more than one, check if the first element and last element are equal. if it is
print true, if not print false.
If the length is not more than 1, print not valid an array
int[] x = {1,2,3}; = > false
int[] y = {1,2,3,1}; = > true
int[] z = {1,2,1}; = > true
int[] k = {1}; = > not a valid array
		 */

		int[] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1};
		int[] k = {1};
		
		System.out.println(firstLastEqual(x));
		System.out.println(firstLastEqual(y));
		System.out.println(firstLastEqual(z));
		System.out.println(firstLastEqual(k));
	}
	public static String firstLastEqual(int[] array) {
		
		if(!(array.length>1)) {
			return "not valid array";
		}
		if(array[0]== array[array.length-1]) {
			return "true";
		
		}else {
			return "false";
			}
		
		
	}

}
