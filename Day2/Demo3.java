package Day2;

public class Demo3 extends Demo2 {

	void sum(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String args[]) {
		Demo3 d=new Demo3();
		d.sum(5, 6);
	}
}
