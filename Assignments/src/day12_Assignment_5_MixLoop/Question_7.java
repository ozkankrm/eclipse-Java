package day12_Assignment_5_MixLoop;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to print all the numbers between 1 and 100 (including 1 and 100)
//		which are divisible by 5.
	
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				System.out.print(i + ",");
			}
		}
	}

}
