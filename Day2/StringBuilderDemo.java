package Day2;

public class StringBuilderDemo {

	public static void main(String args[]) {
		StringBuilder stringBuilder=new StringBuilder("Today is day 2 of");
		//stringBuilder.append(" Java");
		//stringBuilder.insert(17,"Java");
		//stringBuilder.replace(3, 9, "StringBuilder");
		//stringBuilder.delete(4, 11);	
		stringBuilder.reverse();
		
		System.out.println(stringBuilder.capacity());
	}
}
