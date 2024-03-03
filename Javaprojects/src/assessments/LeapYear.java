package assessments;

public class LeapYear {
	
	void year(int year) {
		if (year % 4 == 0) {
	        System.out.println(year + " is a leap year.");
	    }
	    
	    else
			System.out.println(year + " is not a leap year.");   	
	}
	
	public static void main(String[] args) {
		LeapYear l1 = new LeapYear();
		l1.year(2023);
	  }
	
	}
