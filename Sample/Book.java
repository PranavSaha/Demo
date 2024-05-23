package Sample;

import java.util.Date;

public class Book {
	String author_name;
	Date year_of_publish;
	String title;
	
	Book(String author_name,Date year_of_publish,String title)
{
		this.author_name=author_name;
		this.year_of_publish=year_of_publish;
		this.title=title;
		
}
	
	public static void main(String args[]) {
		
		Book("Kishan", 2010, "Devotional");
		
	}

	private static void Book(String string, int i, String string2) {
		// TODO Auto-generated method stub
		
	}

}
