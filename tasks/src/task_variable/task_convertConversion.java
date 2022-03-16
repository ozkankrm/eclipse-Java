package task_variable;

public class task_convertConversion {

	public static void main(String[] args) {
		// 
		int t = 130;
		//byte e = t;
		
		byte e = (byte) t;
		System.out.println(e); // -126
		
		// data tpyler i birbirine dönüþtürmek için valueName in baþýna parantez içinde
		// data türü yazýlýr.
		int number ;
		double dval = 32.33;
		number = (int)dval;
		System.out.println(number);
		
		int y;
		double x = 2.0;
	
		y= (int)x; // douubele deðerin baþýna int yazdýk ve sonuç int türünden olur
		System.out.println(y); // 2
		
		double a;
		int b = 5;
		
		a=b; // double> int olduðu için ve double int kapsadýðý için gönüþtürüyor.
		System.out.println(a);// 5.0

	}

}
