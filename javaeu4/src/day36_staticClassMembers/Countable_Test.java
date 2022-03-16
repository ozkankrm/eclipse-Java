package day36_staticClassMembers;

public class Countable_Test {

	public static void main(String[] args) {


		int objectCount;
	
		/*
		 // eðer static yoksa oluþturulan her obje classtan gelir ve önce 0 olur sonra count++ dan 1 artarak 1 olur.
		Countable obj1 = new Countable();//1
		Countable obj2 = new Countable();//1
		Countable obj3 = new Countable();//1
		
		objectCount = obj1.getInstanceCount();
		objectCount = obj2.getInstanceCount();
		
		System.out.println(objectCount);
		*/
		
		
		Countable obj4 = new Countable();
		Countable obj5 = new Countable();
		Countable obj6 = new Countable();
		
		//baþýna static koyduðumuz için eðiþikler classta oluyor ve ilk 0 sonra count++ dan her seferinde 1 artar ve sonraki
		// objeye artmýþ hali aktarýlýr.
		objectCount = obj4.getInstanceCount();//1
		objectCount = obj5.getInstanceCount();//2
		objectCount = obj6.getInstanceCount();//3
		
		System.out.println(objectCount);
		
		System.out.println(Countable.instanceCount);
		

	}

}
