package day5_unary_assignment_relational_operators;

public class mixedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1= i1+i2;
		double res2 = i1 + f1; // buna floatta atanabilir
		double res3 = i2 + d1;
		
		short firstNumber =10;
		short secondNumber =20;
		
	  // short thirdNumber = firstNumber+secondNumber; // bu çalýþmaz. + varsa int olur
		
		int thirdNumber = firstNumber+secondNumber; // int olunca hata vermedi
		
		short thirdNumber2 = (short)(firstNumber+secondNumber);
		
		
		byte b1 = 20;
		byte b2 = 2;
		
    //  byte b3 = b1*b2; // çalýþmaz çünkü int sayýlar var bunu aþýðýdaki gibi byte çevirip çalýþýr
	    
	    byte b4 = (byte)(b1*b2);
	    
		
		int a1 = 20;
		int a2 = 30;
		
		byte res = (byte)(b1+b2); // casting is required burda variable olduðu için 
		
		byte re2 = 126 + 1; // NO casting is required burda variable olmadýðý için ve limit içind eolduðu için geçerli
		
		int t = 100;
		System.out.println(++t); //101
		System.out.println(--t); //100
		
	}

}
