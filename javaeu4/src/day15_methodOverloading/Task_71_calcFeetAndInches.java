package day15_methodOverloading;



public class Task_71_calcFeetAndInches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		�Create a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
		Feet is the first parameter, inches is the second parameter.
		�You should validate that the first parameter feet is >=0, and second parameter inches is
		>=0 and <=12. Return -1 from the method if either of the above is not true.
		�If the parameters are valid, then calculate how many centimeters comprise the feet and
		inches passed to this method and return that value.
�Create a second method of the same name but with only one parameter inches is the
parameter and validate it >=0, return -1 if it is not true. But if it is valid, then calculate how
	many feet are in the inches.
	�Call the other overloaded method passing the correct feet and inches calculated so that it
	can calculate correctly.
		�Hints : Use double for your number datatypes
		1 inch = 2.54cm and 
		1 ft =12 inches
		*/
		
//		calcFeetAndInchesToCentimeters(10, 10);
	
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(156);
		
//		calcFeetAndInchesToCentimeters(6, 0);
//		calcFeetAndInchesToCentimeters(-10, 0);
//		calcFeetAndInchesToCentimeters(0, 1);
		
		
		
		
		
	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		
		if(feet<0 || (inches<0 || inches>12)) {
			System.out.println("Invalid feet or inches");
			return -1;		
		}
		
		double	centimeters = (inches*2.54 +(feet*12*2.54));
			
			System.out.println(feet +" feet, " + inches + " inches = " + centimeters+ " centimeters" );
			
			return centimeters;
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches<0) {
			return -1;
		}
		
		double	feet = (int)inches/12;
		double remainingInches = inches%12;
		System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
			
			return calcFeetAndInchesToCentimeters(feet, remainingInches); 
		
	}

}
