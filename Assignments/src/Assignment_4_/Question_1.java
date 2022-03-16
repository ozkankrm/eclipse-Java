package Assignment_4_;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		/*
		 * The body mass index (BMI) is used to estimate the risk of weight-related problems 
		 *  based on a subject's height and mass. It was designed by the mathematician 
		 *  Adolphe Quetelet in the 1800s and is sometimes referred to as the Quetelet index. 
		 *  The BMI is computed as:

       BMI = mass / (height * height)

In this formula, mass is in kilograms and height is in meters. The health risk associated with a 
BMI value is

      - Underweight<18.5

      - Normal Weight>=18.5 and <25

      - Overweight>=25 and <30

      - Obese>=30

In this case study, the users input their weight in pounds and height in feet and inches. 
The program then outputs the BMI and associated health risk. To do this we must first make our 
program convert from pounds to kilograms. One kilogram is 2.2 pounds. Additionally, the program must
 convert height in feet and inches to meters. If we convert the height to all inches,
  then we can multiply by 0.0254 to convert inches to meters.

Sample Output:

Your weight in pounds:  150

Your height in feet followed by a space then additional inches: 5 5

Your BMI is 25.01349811736

Your risk factory is Overweight
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your weight");
		double weight = scan.nextDouble();
		
		System.out.println("Enter your feet and inches");
		double feet = scan.nextDouble();
		double inches = scan.nextDouble();
		
		// convert feet to inches
		// 1 feet--> 12 inches
		feet = feet*12;
		
		// convert inches to metres
		// 1 meter-->0.0254 inches
	double height = (inches + feet)*0.0254;
	
	//we convert pound to kg
	weight = weight/2.2;
	
	double bmi = weight/(height*height);
	
	System.out.println(bmi);
	
	if(bmi<18.8) {
		System.out.println("Underweight");
	}else if(bmi>=18.5 && bmi<25) {
		System.out.println("Normal Weight");
	}else if(bmi>=25 && bmi<30) {
		System.out.println("Overweight");
	}else if(bmi>=30) {
		System.out.println("Obese");
	}
		
		
	}
	

	

}
