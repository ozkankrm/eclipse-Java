package day26_arrays_part3;

public class StringManupulationArray {

	public static void main(String[] args) {


		String[] myCars = {"Honda", "Mercede", "BMW", "Toyota", " Ford "};
		
		System.out.println(myCars[0].length());// ilk elementin uzunluðunu verdi // 5
		
		System.out.println(myCars[1].charAt(2));// ikince elementin 3.cü charýna ulaþtý// r

		System.out.println(myCars[4].trim());
		
		System.out.println(myCars[2].substring(2, 3));
		
		System.out.println(myCars[1].equals(myCars[2]));
		
		System.out.println(myCars[1] == myCars[2]); // false
		
		System.out.println("-------------------------------");
		
	for(int i=0; i<myCars.length; i++) {
	 System.out.println(myCars[i].length());// stringdeki her elementin kaç karakteri olduðunu yazdýrýr 
											// honda: 5
	 										//bmw: 3 vs.
		}
		
	}

}
