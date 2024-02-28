package basicprograms;
import java.util.*;

public class Date_time {
	
	public static void main(String[] args) {
		
		Date d1 = new Date(); // Current time in epoch
		System.out.println(d1.getTime());
		
		Date d2 = new Date();// Current time in human understand
		System.out.println("This is my current time: "+d2);
		
		//now lets find future time
		Date d3 = new Date(d1.getTime()+(1000*60*60*24*5));
		System.out.println("This is my Future time: "+d3);
		
		//now lets find Past time
		
		Date d4 = new Date(d1.getTime()-(1000*60*60*24*5));
		System.out.println("This is my Past time: "+d4);
	}

}
