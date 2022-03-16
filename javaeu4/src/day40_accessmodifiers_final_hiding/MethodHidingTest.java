package day40_accessmodifiers_final_hiding;

public class MethodHidingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Bear{
	
	//eğer parent class methodu static ise childe cass methodu da static olut
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

class Panda extends Bear{
	
	//hiding
	public static void eat() {
		System.out.println("Panda is eating");
	}
	
	/*
	
	public void sneeze() {
		System.out.println("Panda is sneezing");
	}
	*/
	
	@Override
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
}






