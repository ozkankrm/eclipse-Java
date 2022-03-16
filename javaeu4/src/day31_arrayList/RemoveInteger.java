package day31_arrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {


		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());// 0 // nothing assign yet
		
		System.out.println(nums.isEmpty());// true
		
		System.out.println(nums.size()==0);// true
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());// [4, 1, 44, 5, 10, 100, 55]
		
		nums.remove(5);// index 5 teki element kaldýrýlýr.( index 5 = 100 silinir)
		System.out.println(nums.toString()); // [4, 1, 44, 5, 10, 55]
		
		// spesifik bir rakamý kaldýrmak istiyorsan önce objeye çevir sonra remove yap
		Integer n1 = new Integer(5);// converting primitive to object
		Integer n2 = Integer.valueOf(5);// Integer deðeri önce obeye çevirdik 
		
		nums.remove(n1);// direk objeyi kaldýrtabiliriz.(burda 5 yi kadlýrdýk)
		System.out.println(nums.toString());// [4, 1, 44, 10, 55]
		
		nums.remove(new Integer(4));// 4 rakamýný burda objye dönüþtürdük ve kaldýrdýk
		System.out.println(nums.toString());//[1, 44, 10, 55]
		
		
		

	}

}
