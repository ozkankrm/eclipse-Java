package day36_staticClassMembers;

import static java.lang.Math.*;// import all static properties belongs to math class

public class StaticImport {

	public static void main(String[] args) {


		System.out.println(Math.sqrt(16));
		
		// yukarda static import ekledeğimiz için class ismi 
		// olmadn methodu çağırabiliyoruz.
		System.out.println(sqrt(16));
		
		System.out.println(PI);

	}

}
