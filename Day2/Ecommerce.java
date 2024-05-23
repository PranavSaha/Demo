package Day2;

public class Ecommerce {
	public static int getOrder_id() {
		return order_id;
	}


	public static void setOrder_id(int order_id) {
		Ecommerce.order_id = order_id;
	}


	public static int getOrder_name() {
		return order_name;
	}


	public static void setOrder_name(int order_name) {
		Ecommerce.order_name = order_name;
	}


	static int order_id;
	static int order_name;
	
	
	static {
		System.out.println("static block initialised:");
	}
	
	
	public static void main(String args[]) {
      
   	 
        Ecommerce s1 = new Ecommerce(1,"Alice");
        Ecommerce s2 = new Ecommerce(2,"Bob");
 
        s1.Ecommerce();
        s2.getStudentInfo();
	}

}
