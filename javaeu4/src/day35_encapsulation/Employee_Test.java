package day35_encapsulation;

public class Employee_Test {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		Employee e2 = new Employee("Mark Jones", 39119);
		Employee e3 = new Employee("Tedd", 81775, "sales", "sales person");
		
		System.out.println(e1.getName() + " | " + e1.getIdNumber() + " | " + e1.getDepartment() + " | " + e1.getPosition());
		System.out.println(e2.getName() + " | " + e2.getIdNumber() + " | " + e2.getDepartment() + " | " + e2.getPosition());
		System.out.println(e3.getName() + " | " + e3.getIdNumber() + " | " + e3.getDepartment() + " | " + e3.getPosition());
	
		// code
		e1.setName("Mike");
		e1.setIdNumber(45775);
		e1.setDepartment("Accounting");
		e1.setPosition("assistant");
		System.out.println(e1.getName() + " | " + e1.getIdNumber() + " | " + e1.getDepartment() + " | " + e1.getPosition());
	
	}

}
