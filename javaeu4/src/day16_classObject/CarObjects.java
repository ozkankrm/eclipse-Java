package day16_classObject;

public class CarObjects {

	public static void main(String[] args) {
		
//		car1 object olþturduk 
		Car car1 = new Car();
		
		
		car1.printCarInfo();// böyle yazdýrýdsak default deðerler alýr 
//							önce objeye deðer vermemiz lazým

		car1.make = "BMW";
		car1.model = "X3";
		car1.color = "Red";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();//burda yukarda atadýðýmýz deðerlerle yazdýrýr
		
		car1.showCurrentSpeed(100);
		car1.showCurrentSpeed(50);
		
		car1.drive();
		
		System.out.println("before: " + car1.currentSpeed);
		car1.accelerate(20);// methoddaki formülü buraya yazdýrdý
		System.out.println("after: " + car1.currentSpeed);
	}

}
