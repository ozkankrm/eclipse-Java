package repl_6_Arrays2;

import java.util.Arrays;

public class _205_MethodsWithArrays2_AddElements {

	public static void main(String[] args) {
		/*
		 * Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array.
		 *  You can assume that each array has 5 elements

addElements(new int[][10, 40, 50, 3, 1],
            new int[][11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]

		 */

		int[] x = {10,40,50,3,1};
		int[] y = {11,0,500,44,1101};
		
		System.out.println(Arrays.toString(addElements(x, y)));
	}
	public static int[] addElements(int[] ints1, int[] ints2) {
	    
	    int[] newArray = new int[5];
	    
	    
	    for(int i=0; i<5; i++) {
	    	newArray[i] = ints1[i] + ints2[i];
	    	
	    }
	
	    return newArray;
	  }
	
}
