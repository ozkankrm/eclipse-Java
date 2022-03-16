package day26_arrays_part3;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {
		//iki  method oluþtur birinde array oluþturikincisinde yazdýr

		
	printArray(5);
	
	}
	
	public static int[] creatArray(int arraySize) {
		
		Random rn = new Random();
		
		int[] myArray = new int[arraySize];
		
		for(int i=0; i<myArray.length; i++) {
			
			myArray[i] = rn.nextInt(100);// her bir elemente assign yaptýk random ile
		}
		
		return myArray; // reference name 
	}
	
	public static void printArray(int number) {
		
		for(int value : creatArray(number)) {// yukarýdaki array return olduðu için onu çaðýrýp yazdýrdýk
			System.out.println(value);		//  creatArray() yukardaki methodu çaðýrma yöntemi ve 
		}									// ve içine (int) int deðer almasý lazým. oraya number koyduk
											//	creatArray(number)
	}

}
