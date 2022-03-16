package day25_arrays_part2;

import java.util.Arrays;

public class Task_92_TableArray {

	public static void main(String[] args) {
		/*
		 * ØWrite a Java program to store numbers 1 to 10 in an array using data instantiation.
		 *  Then write a
for loop to multiply each member of above array by 19, this way you will get table of 19 stored
in the above array. Finally write another for loop to print all the array elements.
ØYou should get the following output:
19
38
57
76
95
114
133
152
171
190=
	*/	
		
//		firts way
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			
			num[i] = i+1;// çarpmada sýfýr olamayacaðý için i yý 1 den laþmak için +1 koyduk
						// i 0 olursa ilk element sýfýr olur. ama sonuçta öyle birþey istenmiyor	
		}
		
		for(int i=0; i<num.length; i++) {
			
			System.out.println( num[i] * 19 );
		}
		
		System.out.println(Arrays.toString(num));// bu yöntemle arraydaki tüm elementleri yazdýrýr
								//output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	
		
		
//		second way
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//		
//		
//		int n = 19;
//		
//		for(int i=0; i<numbers.length; i++) {
//			
//			System.out.println(numbers[i] + " x " + n + " = " + (numbers[i]*n));
//		}
		
		

		
		
		
		
		
		
	}

}
