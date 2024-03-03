package assessments_task;

public class Assessment14_Year_is_leap {
	
	public static void main(String[] args) {
		
		int year = 2023;
		
		if(year%4 ==0) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}

}
