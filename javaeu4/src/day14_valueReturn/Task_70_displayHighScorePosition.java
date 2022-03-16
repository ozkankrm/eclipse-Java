package day14_valueReturn;

public class Task_70_displayHighScorePosition {

	public static void main(String[] args) {
//		Create a method called displayHighScorePosition. It should have a players name as a
//		parameter, and a 2nd parameter as a position in the high score table. You should
//		display the players name along with a message like �managed to get into position�
//		and the position they got and a further message �on the high score table�
		
//		� Create a 2nd method called calculateHighScorePosition. It should be sent one
//		argument only., the player score. It should return an int. The return data should be :
//		1 � if the score is >=1000
//		2 � if the core is >=500 and <1000
//		3- if the score is >=100 and <500
//		4- in all other cases
//		� Call both methods and display the results of the following:
//		a score of 1500, 900, 400 and 50

		int x = calculateHighScorePosition(500);
		
		displayHighScorePosition("Mike", x); // bunun i�ine return koyduk
		
		displayHighScorePosition("Tom", calculateHighScorePosition(1500));
}
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		
		System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
	}
	public static int calculateHighScorePosition(int playerScore) {
		
		if(playerScore>=1000) {
			return 1;
		}else if(playerScore>=500 && playerScore<=1000) {
			return 2;
		}else if(playerScore>=100 && playerScore<500) {
			return 3;
		}else {
			return 4;
		}
	}
	
}