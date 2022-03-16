package day23_RandomClass;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rn = new Random();
		
		System.out.println(rn.nextInt());// her çalýþtýrdýðýmýz random olarak numara verir
		
		System.out.println(rn.nextDouble());//0.0 ile 1.0 arasýnda rastgele sayý verir
	
		System.out.println(rn.nextFloat());//0.0 ile 1.0 arasýnda rastgele sayý verir
		
		System.out.println(rn.nextBoolean());// false, true rastgele verir. bazen true bazen false
		
		System.out.println(rn.nextInt(10)); // 0-9 aralýðýnda verir 9 dahil ama 10 dahil deðil
		
		System.out.println(rn.nextInt(50));// 0-49
		
//		 5-15 aralýðý için +5 ekle
		System.out.println(rn.nextInt(10)+5 ); // 5-14 
	
	}

}
