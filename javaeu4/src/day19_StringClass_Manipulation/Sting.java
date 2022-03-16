package day19_StringClass_Manipulation;

public class Sting {

	public static void main(String[] args) {
//		String java.lang package içinde ve bu package otomatik olaraak import oluyor
//		ve hazýr var. bu nedenle import kullanarak içe aktarmadýk zaten hazýr var


//		literal ile string objecti oluþtma
//		string pool dan check eder varsa ordan kullanýr 
//		yoksa yenisini oluþturur ve string poola koyar
		
		String a = "Orange";
		String str2 = "Table";
		String str3 = "Apple";
		String str4 = "Computer";
		System.out.println(a);
		
//		new keyword kullanarak string object oluþturma
		String str = new String("Apple");
		
	
		
		System.out.println(str);
		
		String firstHelloWorld = new String("Hello World");
		
		System.out.println(firstHelloWorld); // Hello Word
		
	}

}
