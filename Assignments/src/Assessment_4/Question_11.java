package Assessment_4;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String space =" ";
		String composite = space +"hello" + space + space;
		composite.concat("world");// bunun sürece bir etkisi yok
		
		String trimmed = composite.trim(); // burdaki composite Strinden geliyor
											// trim baþkati ve sondaki spacelerisilir. 
											// sadece hello kalýr
		System.out.println(trimmed.length());//5
	}

}
