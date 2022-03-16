package day17_ClassObjectsPart2;

public class CarObjects {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		BMW b2 = new BMW();
		
		System.out.println(b1.make); //BMW
		System.out.println(b2.make);//BMW --CLASSTA VERDÝÐÝMZ DEÐER HPSÝNE AKTARILDI

		b1.make = "BMW2019";
		System.out.println(b1.make); //BMW2019 b1.make yeni deðer atadýk
		
		System.out.println(b2.make);//BMW // eski deðer devam eder. daha deðiþmedi
	
		System.out.println(b1.model);// null -- deðer atanmamýþ
		
		b1.model = "m3";
		
		System.out.println(b1.model);// m3
	
		b1.showPrice();
		
		
		b2.model = "x3";
		b2.showPrice();
	}

}
