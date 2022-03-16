package week5_methodPractice;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		RECRUCÝON: a method calling itself :  BUT WHY
		
		//infinite 
		// sürekli kendisini çaðýrýp durur ve sayý 1 azalarak
	
		printNumber(10);
		
	}

	public static void printNumber(int n) {
		
		if(n==0) { // burdaki koþulla inifinite olmaktan çýkar ve n=0 olduðunda
			System.out.println("THE END!!");
			return; //sistemden çýkar
		}
		
		System.out.println(n);
		
//		call printNumber with different number below
//		for example one less than the value of n
		printNumber(n-1);
	}

}
