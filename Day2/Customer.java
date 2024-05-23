package Day2;

import java.util.Date;

public class Customer {
	
	public Customer(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}

	String name;
Account account;
	
	

	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public static void main(String args[]) {
		Car car=new Car("BMW",new java.util.Date(System.currentTimeMillis()));
	Driver driver= new Driver("Mohan",car);	
	System.out.println();
	
	}
}
