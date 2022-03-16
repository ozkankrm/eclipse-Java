package day24_arrays_Part1;

public class Array_Creation {

	public static void main(String[] args) {
		
//		String[] args
		
//		[] square brackets mendatory
//	option-1  separate statement
		int[] numbers;
		numbers = new int[3]; // 3 sayýsý içinde kaçtane deðerin olduðunu gösterir
		System.out.println(numbers[2]);
		
//		option-2 single statement
		int[] number1 = new int[4];// 4 number1 nýn size dýr ve bu deðiþmez ancak içindeki 
									// deðerleri deðiþtirebilirsin
		
		float[] temp = new float[100];
		char[] letters = new char[40];
		long[] units = new long[20];
		
		String words[]= new String[8];
		
		System.out.println(number1[2]);// default valu int=0
		System.out.println(temp[80]); // default value float=0.0
		System.out.println(words[4]);// default value string= null
		System.out.println(units[50]);// error verir 50 last value deðil enfalz 49 olur ve leng aþmýþ olur
		System.out.println(units[49]); // double default value double=0 
			
		
		int[] scores = new int[4];
		
		String name[] = new String[5];
		
		String[] name1 = new String[5];
		
		double[] students = new double[1];
		
		int[] i;
		i= new int[3];
		int[] s1;
		
		final int NUM_ELEMENTS = 66;
		int [] numbe = new int[NUM_ELEMENTS];
		System.out.println(numbers);

	}

}
