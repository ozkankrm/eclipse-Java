package day12_Assignment_6_NestedForLoop;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=7; i++){
			for(int j=1; j<=8-i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i=2; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	

}
