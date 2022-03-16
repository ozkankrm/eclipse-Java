package day16_classObject;

public class DogObjects {

	public static void main(String[] args) {
//		yazdýrma iþlemini main method da yapýyoruz
//		yeni objeyi  urda oluþturuyoruz

//		yeni object oluþturduk
	 Dog dog1 = new Dog();
	 
	 Dog dog2 = new Dog(); // bu objeci oluþturduk ve atma yapmadýysak 
//	 					default value alýr yani string null int 0 boolean false alýr
	 Dog dog3 = new Dog();
	 
//	 object adýný yaz ve (.) koyup öteki classtan oluþturulan propertiesleri çaðýrýð ve deðer verilir
	 dog1.age = 10; // yeni atama yaptýk
	 dog1.breed = "Maltese";
	 dog1.color = "White";
	 dog1.name = "Rover";
	 
//	yazdýrma 
	 System.out.println(dog1.age); //printin içine koyarak yazdýrýrýz
	 System.out.println(dog1.breed);
	 System.out.println(dog1.color);
	 System.out.println(dog1.name);
	 
//	 class taki methodlarý çaðýrdýk ve yazdýrýr
	 dog1.barking();
	 dog1.hungry();
	 dog1.sleeping();
	 
	 
	 
	 
	}

}
