package day37_inheritance;

//Persn-->parent
//Employee--> child
// Employee classýnýn önüne-->entends Person yazdýðýmýzda
// Person classýndaki fields ve methodlarý Employee classa 
//aktarmýþ oluyor
public class Employee extends Person{
	
	String jobTitle;
	
	public void work() {
		System.out.println(name + " is working as " + jobTitle);
	}

	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	
	

}
