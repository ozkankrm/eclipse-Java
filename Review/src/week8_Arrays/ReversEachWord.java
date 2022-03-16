package week8_Arrays;

public class ReversEachWord {

	public static void main(String[] args) {


		System.out.println(reverseEachWord("I love learning java"));
		System.out.println(reverseEachWord("Today is a nice day"));

	}
	public static String reverseEachWord(String str) {
		
		String[] words = str.split(" ");// önce tüm kelimeleri birer array elementine çevirdik
		
		String reverse = "";
		
		for(String wrd  : words) {
			String reverseEach = "";
			for(int i=wrd.length()-1; i>=0; i--) {
				
				reverseEach += wrd.charAt(i);// her kelimeyi tersine çevirdik
			}
			reverse += reverseEach + " ";
		}
		return reverse.trim();// başta veya sonda space olmasın diye trim yaptık
	}

}
