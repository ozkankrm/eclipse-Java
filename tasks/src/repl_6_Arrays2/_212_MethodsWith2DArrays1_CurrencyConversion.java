package repl_6_Arrays2;

public class _212_MethodsWith2DArrays1_CurrencyConversion {

	public static void main(String[] args) {
		/*
		 * Bob has traveled a lot and has a lot of currency types.
He needs a machine that will get currency and convert it to dollars.
The machine already gets the money and can categorize it onto type and amount.
 it also have the current conversion rates.
the only thing it needs is a way to calculate all of it into dollars.

Method arguments:

-money (String[][]): 
a 2d array of strings, each row gets two places, one for currency type second for the amount:
[
["euro","1.5"],
["yen","21.5"],
["mark","100.0"]

]

the amount value is a string you will have to convert it to double to use it for calculations.

-convertionRate (String[][]):
another 2d array of strings, first place in each row holds the currency name second is the 
conversion rate to dollars for example:

[
["euro","0.003"],
["yen","0.5"],
["mark","0.87"]
]

return:
the sum of all currencies in dollars as a double.

You need to write code to read how much of given currency Bob has and check USD conversion
 rate for that currency in the second array then multiple them to get how much USD he will
  end up with total.

for example:
convertC([["drachma","11.0"],["sek","5.0"]]   ,   [["drachma","0.6"],["sek","100"]]);
returns:  506.6
(Bob has 11.0  drachma and 5.0 Sek currency money and he needs to convert them to USD.
 Conversion rates are in second array. So we multiple (11.0 * 0.6) +(5.0 * 100) and return 
 the result    )

convertC([["yen","5.0"],["frank","5.0"]]   ,   [["yen","1"],["frank","1"]]);
returns: 10

hint: use  
Double.parseDouble(text);
to convert string to double


		 */
		
		 
	     String[][] test_money =
	     {
	       {"mark","5"},
	       {"shekel","30.5"},
	     };
	     
	     //test_money[0][1]
	   //test_money[1][1]
	     String[][] test_convert=
	     {
	       {"mark","1"},
	       {"shekel","0.5"},
	     };
	     
	     //test_convert[0][1]
	   //test_convert[0][1]
	     
	     //Double.parseDouble(test_convert[0][1]
	     
//	     double res = Main.convertC(test_money,test_convert);
//	     System.out.print(res);
	     

	}
	
	public static  double convertC(String[][] money,String[][] convertionRate) 
	  {
		
		double sum = 0;
	    // capture the moneyAmount and conversion rate from the 2D arrays
	  
		for(int i=0; i<money.length; i++) {
				
			double amount = Double.parseDouble(money[i][1]);
			double rate = Double.parseDouble(convertionRate[i][1]);
			
			sum += amount*rate;
		
		}
	  
	  return sum;
	  }

}
