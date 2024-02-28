package basicprograms;

import java.util.Date;

public class Future_time {
	
	public static void main(String[] args) {
		
		Future_time f1 = new Future_time();
		Date d1 = new Date();
		System.out.println(d1.getTime());
		 
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		String time = d2.toString();
		String date = time.substring(8, 10);
		System.out.println(date);
		
		String month = time.substring(4, 7);
		System.out.println(month);
		
		String year = time.substring(24);
		System.out.println(year);
		
		System.out.println(date.concat(month).concat(year));
		
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	}

}
