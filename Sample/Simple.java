package Sample;

import java.util.Scanner;

public class Simple {
	public static void main(String args[]) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println("Enter other number");
		b=sc.nextInt();
		boolean x=true;
		boolean y=false;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		
		System.out.println(a&b);

	
	}

}
