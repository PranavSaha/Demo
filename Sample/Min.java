package Sample;
import java.util.Scanner;
public class Min {
	

	static void sort(int a[])
	{
	int n=a.length;

	for(int i=0;i<n-1;i++)
	{
	for(int j=0;j<n-1-i;j++){

	   if(a[j]>a[j+1])
	{

	a[j+1]=a[j+1]+a[j];
	a[j]=a[j+1]-a[j];
	a[j+1]=a[j+1]-a[j];
	}
	}
	}
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.of elements:");

	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter elements:");
	for(int i=0;i<n;i++){

	a[i]=sc.nextInt();
	}

	System.out.print("{" );

	for(int i=0;i<n-1;i++){
	System.out.print( a[i]+" ,");
	}
	System.out.print(a[n-1]);

	System.out.print("}");

	System.out.println("");
	sort(a);
	System.out.print("Sorted array:");
	for(int i=0;i<a.length;i++){
	System.out.print(a[i] + " ");

	}
	System.out.println();


	System.out.println("Minimum element is:");
	System.out.println(a[0]);


	}
	}


