package Sample;

import java.sql.Date;
import java.util.Scanner;

public class Car {
	
	String model,car_name,color;
	
	Date date_of_purchase;
	
	public static void property() {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the color of the car:");
		String color=sc.next();
		System.out.println("Enter the Manufacturing year of the car:");
		int year=sc.nextInt();
	
		
		System.out.println("Enter the model of the car:");
		String model=sc.next();
		
	}
	public void start() {
		System.out.println("Car has started");
	}
	public void stop() {
		System.out.println("Car has stopped");
	}
	public void drive() {
		System.out.println("Driver is driving");
	}
 public static void main(String args[]) {
	 property();
 }
}
