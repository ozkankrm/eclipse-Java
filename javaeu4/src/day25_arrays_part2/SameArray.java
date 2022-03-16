package day25_arrays_part2;

import java.util.Arrays;

public class SameArray {

	public static void main(String[] args) {


//		
//		iki arraye da ayný reference atanmýþ ve dolayýsýyla ayný obje var. eðer objede bir deðiþiklik
//		olursa iki arrayda de olur.
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println("myIntArray " + Arrays.toString(myIntArray));
		System.out.println("anotherArray " + Arrays.toString(anotherArray));
		
//		burda ilk element deðiþtiriliyor. ve objede ilk element deðiþti
//		iki array de ayný reference adresi olduðu için
//		ik arrayin de ilk lemeneti deðiþti
		anotherArray[0] = 1;
		
		System.out.println("after change myIntArray " + Arrays.toString(myIntArray));
		System.out.println("after change anotherArray " + Arrays.toString(anotherArray));
		

		int[] array1= {2,4,6,8,10};
		int[] array2 = array1;
		
		array1[0] = 100;
		array2[4] = 1000;
		
		System.out.println("The contents of array1:");
		for(int value :  array1 ) {
			System.out.println(value);
		}
		
		System.out.println();
		System.out.println("The contents of array1:");
		for(int value :  array2 ) {
			System.out.println(value);
		}
		
	}

}
