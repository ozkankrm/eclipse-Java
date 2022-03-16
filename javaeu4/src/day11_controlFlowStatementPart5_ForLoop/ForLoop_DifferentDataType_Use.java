package day11_controlFlowStatementPart5_ForLoop;

public class ForLoop_DifferentDataType_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		farklý data typlerý for loop içinde birlikte kullanmayýz
//		ancak loop un dýþýnda atamasýný yaptýktan sonra loop un içinde kullanabiliriz
		
		long y = 0;
		int x = 0;
		for( y = 0,  x = 0; x < 5 && y < 10; x++, y++) {
			System.out.println(y + " " + x);
		}
		
		System.out.println(x);
	}

}
