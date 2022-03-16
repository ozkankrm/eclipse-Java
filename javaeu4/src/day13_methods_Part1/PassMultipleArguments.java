package day13_methods_Part1;

public class PassMultipleArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showSum(5,10); // parantezin içine farklý deðerler verebiliriz. ve formülümüz çalýþýr
		showSum(15,20);
		showSum(5,30);
	}
	
	public static void showSum(int num1, int num2) {
		System.out.println(num1+num2);
	}

}
