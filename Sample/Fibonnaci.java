package Sample;

import java.util.Scanner;

public class Fibonnaci {
	public static void main(String args[]) {
		int n;
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		n=sc.nextInt();
		
		if(n<=0){
			System.out.println("The number should be positive");
			return;
		}
		for(int i=1;i<=n;i++) {
			System.out.print(a + " ");
			int next=a+b;
			a=b;
			b=next;
		}
		
	}

}
