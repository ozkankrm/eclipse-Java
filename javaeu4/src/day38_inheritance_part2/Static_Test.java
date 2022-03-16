package day38_inheritance_part2;

public class Static_Test {

	public static void main(String[] args) {


		StaticSub obj = new StaticSub();
		
		obj.num = 5;
		obj.print();
		
		// num static olduðu içim SuperclassNmae.methodName
		StaticSuper.num = 10;
		obj.print();
		
		StaticSub.m1();
		
//		bu hata verir m2() static olmadýðý için class ismi ile çaðýramayýz.
//		StaticSuper.m2();

	}

}
