package Day2;

public class DemoStr {
	public static void main(String args[]) {
		String str="Java Demo";
		String str2="Java Training";
		String str1=str.toUpperCase();
		System.out.println(str.indexOf('v'));
		System.out.println(str.lastIndexOf("Demo"));
		System.out.println(str.replace("Demo", "Course"));
		System.out.println(str1);
		System.out.println(str.substring(4,8));
		System.out.println(str.substring(3));
		System.out.println(str.endsWith("o"));
		System.out.println(str.isEmpty());
		System.out.println(str.equalsIgnoreCase(str2));
		
		
		
		
	}

}
