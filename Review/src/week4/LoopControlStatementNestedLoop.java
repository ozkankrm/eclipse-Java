package week4;

public class LoopControlStatementNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 

		 */
			
			for (int row = 1; row <=5; row++) {
				
				for(int column =1; column<=5; column++) {
					System.out.print(column + " ");
					if(column==3) {
						break; // inner loop ta 3 yazdýrý ve sonrasýný yazdýrmaz. he r3 e geliþte sonrasý için dýþ loopa geçer
					}
				}
				System.out.println();
			}
			System.out.println();
		
	outer: //lable for outer loop, and we called outer
		for (int row = 1; row <=5; row++) {
			
			for(int column =1; column<=5; column++) {
				System.out.print(column + " ");
				if(column==3) {
					break outer; // dýþ loop u outer olarak etiketledik ve break outer; yapýnca koþula gelir ve outer loop tan çýkar
				}
			}
			System.out.println();
		}
			System.out.println("*******");
			
			outer: //lable for outer loop, and we called outer
				for (int row = 1; row <=5; row++) {
					
					for(int column =1; column<=5; column++) {
						
//						skip to next row if you see column 3
						if(column==3) {
							continue outer; // 3 ü yazdýrmaz ve atlar
						}
						System.out.print(column + " ");
					}
					System.out.println();
				}
	}

}
