package day7_controlFlowStatement;

public interface If_Else_Statement {

	public static void main(String[] args) {
		
	
	int score = 70;
	if(score>=70) {
		
		System.out.println("Excellent");
		System.out.println("You passed with grade A");
	}
	
	else {
		
		System.out.println("You failed");
	}
	
	
	int sales,bonus;
	double commisionRate,salary;
	
	sales=5000;
	salary=10000;
	
	if(sales>5000) {
		bonus=500;
		commisionRate=1.12;
		
		
	}else {
		bonus=100;
		commisionRate=1.10;
	}
	
	salary=salary*commisionRate+bonus;
	
	System.out.println("Salary = " + salary);
}
}
