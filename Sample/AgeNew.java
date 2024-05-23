package Sample;

import java.util.Scanner;

public class AgeNew {
	public static void main(String args[]) {
		
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age ");
	age=sc.nextInt();
	
	if(age<13) {
		System.out.println("Child");;
	}
	else if(age>=13 && age<20) {
		System.out.println("Teenager");
	}
	else if(age>=20 && age<65) {
		System.out.println("Adult");
	}
	else if(age>=65) {
		System.out.println("Senior");
	}
	
}
}
