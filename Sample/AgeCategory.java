package Sample;

import java.util.Scanner;

public class AgeCategory {
	public static void main(String args[]) {
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		switch(age) {
		case 1:
			if(age<13) {
				System.out.println("Child");;
			}
			
				break;
		case 2:
			if(age>=13 && age<20) {
				System.out.println("Teenager");
			}
			
				break;
			
		case 3:
			if(age>=20 && age<65) {
				System.out.println("Adult");
			}
			
				break;
		default:
		}
		
	}

}
