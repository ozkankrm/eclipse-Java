package week8_Arrays;

import java.util.*;

public class MinMaxNumber {

	public static void main(String[] args) {
		/*
		 *  Create a method that will accept an int array and return an int array of two elements.
		 *   The two elements will be the min and max numbers from the array. 
    Ex: [31,4,1,-9, 300,3] -> [-9, 300]
		 */

		int[] x = { 1,6,-5,9,120};
		
		System.out.println(Arrays.toString(getMinMax(x)));
		System.out.println(Arrays.toString(getMinMax(x)));
	}

	public static int[] getMinMax(int[] arr) {
		
		int[] result = {arr[0], arr[0]};
		
		for(int num : arr) {
			if(num < result[0]) {
				result[0] = num;
			}
			if(num > result[1]) {
				result[1] = num;
			}
		}
		return result;
	}
	
	
	public static int [] getMinMax2(int[] arr) {
		
		Arrays.sort(arr); // sort() ile önce sýraya koyduk sonra en küçüðü ve en büyüðünü aldýk
		
		return new int[] {arr[0], arr[arr.length-1]};
//		return new int[] {arr[1], arr[arr.length-2]};// second en büyük ve en küçüðü bulmak için indexlerden ayarlarýz
		
	}
	
}
