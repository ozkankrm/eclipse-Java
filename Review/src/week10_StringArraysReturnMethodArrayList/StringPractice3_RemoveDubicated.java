package week10_StringArraysReturnMethodArrayList;

public class StringPractice3_RemoveDubicated {

	public static void main(String[] args) {
		/*
		 * remove dublicated characters
		 * 
		 * "aabcca"
		 * -->"abc"
		 */
		//approach str daki elemeaný tek tek cehek eder eðer resultta yoksa ekler
		String str = "aabcca";
		
		String result = "";  // "abc"
		
//		String[] arr = str.split("");
							// [a,a,b,c,c,a]
		for(String each :  str.split("")) { // önce stringi array yaptýk
			
		if(!result.contains(each)) { // eðer string deki element resultta yoksa
			result += each;          // resulta ekle
		}
		}
		
		System.out.println(result);
		
	}

}
