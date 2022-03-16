package day24_arrays_Part1;

import java.util.Random;
import java.util.*;

public class Task_88_CarArray {

	public static void main(String[] args) {
		/*
		 * Create an array that holds cars (Honda, Toyota, Nissan, BMW, Mercedes, Porsche,
Ferrari)
� Ask user to enter an index number to choose his dream car.
� Print the price for selected car.
Car prices :
Honda � Toyota � Nissan (Random price between 20000 and 40000)
BMW-Mercedes(Random price between 50000 and 80000)
Porsche - Ferrari(Random price between 100000 and 150000)
� Hint : finding a random number between 2 numbers = > ((max - min) + 1) + min
		 */

		Scanner scan = new Scanner(System.in);
		Random rn = new Random();
		int price = 0;
		
		String[] car = new String[7];
		
		car[0] = "Honda";
		car[1] = "Toyota";
		car[2] = "Nissan";
		car[3] = "BMW";
		car[4] = "Mercedes";
		car[5] = "Porsche";
		car[6] = "Ferrari";
		
		
		System.out.println("Select your car:");
		int indexCar = scan.nextInt();
		String selectedCar = car[indexCar];
		
		
		switch(selectedCar) {
		case "Honda": case "Toyota": case "Nissan":
			price = rn.nextInt((40000-20000)+1)+20000;
			break;
		case "BMW": case "Mercedes":
			price = rn.nextInt((80000-50000)+1)+50000;
			break;
		case "Porsche": case "Ferrari":
			price = rn.nextInt((150000-100000)+1)+100000;
			break;
		default:
			System.out.println("�nvalid car");
		}
		
		System.out.println("Price for selected car is " + price);
		
		
		
		
		if(car[indexCar].equals("Honda") || car[indexCar].equals("Toyota") || car[indexCar].equals("Nissan") ) {
			
			
		}else if(car[indexCar].equals("BMW") || car[indexCar].equals("Mercedes")) {
			
			
		}else if(car[indexCar].equals("Porsche") || car[indexCar].equals("Ferrari")) {
			
			
		}
	}

}
