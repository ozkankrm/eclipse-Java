package day13_methods_Part1;

public class StudentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		sayHello(); // method adýný parantez ve semi colon ile main methodun içine yazýyoruz ve yzadýrýr
		sayHello();// ayný methodu istediðin kadar kullanabilirsin
		sayHello();
		
		code();
		study();
	}
	
	public static void sayHello() {
		System.out.println("Inside sayHello method");
	
	}
	
	public static void code() {
		System.out.println("Student is studying");
	}
	
	public static void study() {
		System.out.println("Student is studying jav");
	}
	

}
