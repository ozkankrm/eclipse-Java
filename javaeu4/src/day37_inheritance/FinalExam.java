package day37_inheritance;

public class FinalExam extends GradeActivity{
	
	private int numQuestions;
	private double pointEach;
	private int numMissed;
	
	
	
	public FinalExam(int numQuestions, int numMissed) {
		
		double numericScore;
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointEach = 100.0/numQuestions;
		numericScore = 100.0-(numMissed*pointEach);
		
		// my goal is to receive the letter based on my numreciScore
		
		// score GradeActivity classýnda private olduðu için
		// nu doðrudan burda atama yapamýyoruz
		// setter ile ona ulburda atama yapmýþ olduk.
		// eðer score public olsaydý doðrudan uburda atama yapabilirdik
		setScore(numericScore); 
	
	}
	

}
