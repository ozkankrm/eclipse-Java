package day14_valueReturn;

public class Task_66_calculateTravelled {

	public static void main(String[] args) {
		
//		The distance a vehicle travels can be calculated as follows:
//			Distance = Speed * Time
//			Write a method named distance that accepts a vehicle’s speed and time as arguments,
//			and return the distance the vehicle has traveled.

		double totalDistance = distance(50, 2);
		
		System.out.println(totalDistance); // bu þekilde de yazdýrýlabilir
		System.out.println(distance(10, 5)); // bu þekilde de yazdýrýlabilir
		
		
//		buraya if, loop switch vb iþlemler yapabilirsin
		
	}

	public static double distance(double speed, double time) {
		
		double distanceTraveled;
		distanceTraveled = speed*time;
		
		return distanceTraveled; // return ayrýca breaking görevi görür ve burdan sonra birþey yazdýðýnda hata verir
		
//		System.out.println(); //bu hata verir
		
	}
}
