package day13_methods_Part1;

public class PassArgument {

	public static void main(String[] args) {
		
		
       displayValue(10);
       
       int x=5; // eðer burda atamamýþsak burdaki variablename ile method içindeki ayný olmasa da çalýþýr
       displayValue(x); // 5 yazdýrýr ve num yerine geçer diðer iþlemleri de yapar
       displayValue(x*4); //40 yazdýrýr ve sonraki adýmlar num 40 olarak diðer iþmlemleri yapar
	}
	
	public static void displayValue(int num) { // parantez içine declare yapýyorsun sonra çaðýrýrken deðer veriyorsun
//										parantez içine deðer verdiðinde çaðýrýrken mutlaka deðer vermek lazým
//										yoksa hata verir
		System.out.println("The value is " + num); //10 burda iþlemler yapabiliriz
		System.out.println("The value is " + num*2);
		System.out.println("The value is " + (num+2));
	


	}
	
	
}
