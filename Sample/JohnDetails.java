package Sample;

import java.util.Scanner;

public class JohnDetails {
	
	public static void details(String name,String role,long cont1) {
		
		System.out.println("Name:" + name);
		System.out.println("Role:" + role);
		System.out.println("Contact number:" + cont1);
	}
  public static void details(String name,String role,long cont1, long cont2) {
	
		System.out.println("Name:" + name);
		System.out.println("Role:" + role);
		System.out.println("Contact number:" + cont1);
		System.out.println("Contact number:" + cont2);
	}
public static void main(String args[]) {
	
	//JohnDetails ob=new JohnDetails();
	
	details("John", "ASE", 876453287);
	
   details("John", "ASE", 876453287, 876453284);
	
	
}
}
