package day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_6 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and figure out which is greatest element in the
array, a and set all the other elements to be that value. Print the changed array.
int[] x = {1,2,3}; = > [3,3,3]
int[] y = {11,5,9}; = > [11,11,11]
int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]
		 */

		int[] x = {3,2,1}; 
		int[] y = {11,5,9}; 
		int[] a = {110,5,98,0,1200,11,-4};
	
	
		System.out.println(Arrays.toString(greatestElement(x)));
		System.out.println(Arrays.toString(greatestElement(y)));
		System.out.println(Arrays.toString(greatestElement(a)));
	}
	public static int[] greatestElement(int[] array) {
		
		int max = array[0];// burda ilk elementin büyük olduðunu varsaydýk
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i+1]>max) {
				
				max = array[i+1]; // en büyük elementi böyl bulduk
			}
		}
		
		for(int i=0; i<array.length; i++) {
			
			array[i] = max; // her bir elemente en büyük elementi atadýk
		}
		
		return array;
		
		
//		second way
//		// önce arrayi kçükten büyüðe doðru sýrala sonra her elemente son element ata
//		Arrays.sort(array);
//		//System.out.println(Arrays.toString(array));
//		
//		
//		for(int i=0; i<array.length; i++) {
//			
//			array[i] = array[array.length-1];
//		}
//		
//		return array;
	}
	
	
}
