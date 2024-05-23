package Sample;
import java.util.*;
public class Calculate {



		public static void main(String args[]){

		Scanner sc =new Scanner(System.in);
		int[] marks=new int[4];
		int totalMarks=0;
		System.out.println("Enter marks for 4 subject:");
		for(int i=0;i<4;i++){
		 System.out.println("Subject " + (i+1) + " :");
		marks[i]=sc.nextInt();
		totalMarks+=marks[i];
		}
		double percentage=(totalMarks/4.0);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Percentage is : " + percentage + "%");
		}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

