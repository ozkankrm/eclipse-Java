package Assignment_14_OOP;

public class Question_9 {

	public static void main(String[] args) {
		

	}

}

class Telephone{
	
	String number;
	public static int quantity = 250;
	public static double total = 15658.92;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public static int getQuantity() {
		return quantity;
	}
	public static void setQuantity(int quantity) {
		Telephone.quantity = quantity;
	}
	public static double getTotal() {
		return total;
	}
	public static void setTotal(double total) {
		Telephone.total = total;
	}
	
}
