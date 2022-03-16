package day20_StringManupulation_Part2;

public class String_indexOf2 {

	public static void main(String[] args) {
		
//	index of with 2 values
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println(firstDash);//4
		
		
//		second dash e nasýl ulaþýlýr
		int secondDash = list.indexOf('-', 5);// burda fromIndex= 5 ten sonraki ki '-' karakterin indexine bak demek
		System.out.println(secondDash);//13
		
		int thirdDash = list.indexOf('-', 14);
		// burdak 14 secondDash tan sonraki index ve ordan baþlar sonraki characteri bulmaya
		System.out.println(thirdDash);// 21
		
		int forthDash = list.indexOf('-', thirdDash+1);// enson dashtan sonraki indexten baþlar
		System.out.println(forthDash);//29
		
//		veya last chacteri bulmak için  lastIndexOf(chr) kullanýlýr
		int fforhDask = list.lastIndexOf('-');
		
	}

}
