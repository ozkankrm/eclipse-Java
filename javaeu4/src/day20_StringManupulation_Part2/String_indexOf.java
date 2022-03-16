package day20_StringManupulation_Part2;

public class String_indexOf {

	public static void main(String[] args) {
		
		String word1 = "github";
		System.out.println(word1.indexOf("g"));//0 //bþalangýç index numarasýný verir
		System.out.println(word1.indexOf("th"));//2 // start index number
		System.out.println(word1.indexOf("b")); //5
		System.out.println(word1.indexOf("hub")); // 3
		
//		içinde yoksa -1 yazdýrýr.
		System.out.println(word1.indexOf("Java"));// -1
		
		String url = "www.okta.com";
		
		int a = url.indexOf("."); // ilk baþtakinin numarasýný verir
		System.out.println("Post of . " + a);// 3
		
		System.out.println(url.charAt(a+1));// o // char(4) olur ve o harfine karþýlýk gelir
		
//		find position of '-' and check is space is on right and left side
		String title = "Java - Google Search";
		
		int dash = title.indexOf('-');
//		System.out.println(dash);// 5
		System.out.println(title.charAt(dash-1)); //- den önceki space
		System.out.println(title.charAt(dash+1));//- den sonraki space
		
		System.out.println("Apple");

		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Positon of states: " + states);// 7
		
		
		String word2 = "java, c++, python, tomcat, eclipse";
//		check if c++ in the word2
		
//		first contains
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
//		second
//		indexOf eðer -1 ise kapsamýyor ve þartýmýzz -1 den büyük ise kapsýyor demek
		if(word2.indexOf("c++")>-1) {
			
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		
	}

}
