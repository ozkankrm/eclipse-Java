package week15_polymorphism;

public class iPhone extends Phone implements  AppleApp{
	
	/*
	 *   5. create a class named iPhone that inherits Phone and AppleApp
            - actions: texting(), calling(), faceTiming() [ All have long phoneNumber argument ]
            - create a constructor to initialize the fields (brand, model, size, price)
                if the price is more than 2000 don't set the price and print: Invalid Price, Iphone's price cannot more than 2000
	 */

	public iPhone(String model, double price, double size) {
		super("Iphone", model, price, size);
		
		if(price>2000) {
			System.out.println("Iphone's price cannot be more than 2000");
			price = 0;
		}
		
	}
	
	public void faceTiming(long phoneNumber) {
		System.out.println("FceTiming " + phoneNumber);
		
	}

	@Override
	public void download() {
		System.out.println("Downloading from " + AppName);
		
		
	}
	
	@Override
	public void texting(long phoneNumber) {
		System.out.println("Texting to " + phoneNumber);
	
	}

	@Override
	public void calling(long phoneNumber) {
		System.out.println("Calling " + phoneNumber);
		
	}
	
}
