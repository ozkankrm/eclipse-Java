package day8_controlFlowStatement_Part2;

public class task_34_AverageGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int math =90;
		int chem =90;
		int bio = 90;
		
		double average = (math+chem+bio)/3;
		System.out.println("Average is " + average);
		
		if (average>=0 && average<=59) {
			System.out.println("Grade is F");
		}else if(average>=60 && average<=69) {
			System.out.println("Grade is D");	
		}else if(average>=70 && average<=79){
			System.out.println("Grade is C");
		}else if(average>=80 && average<=89) {
			System.out.println("Grade is B");
		}else if (average>=90 && average<=100) {
			System.out.println("Grade is A");
		}
		
	}

}
