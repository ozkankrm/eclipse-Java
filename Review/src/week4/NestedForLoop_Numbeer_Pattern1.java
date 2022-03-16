package week4;

public class NestedForLoop_Numbeer_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4 3 2 1
		 *   3 2 1
		 *     2 1
		 *       1
		 */
		
		
		for(int row = 4; row>=1; row--) {
			
			for(int i=1; i<=(4-row)*2; i++) { //satýrda kaç boþluk oldðunu gösterir
				System.out.print(" "); // 1. satýr-->0, 2. satýr-->2 vs.
			}
			
			for(int col=row; col>=1; col--) {
				
				System.out.print(col + " " );
				
			}
			System.out.println();
		}
	}

}
