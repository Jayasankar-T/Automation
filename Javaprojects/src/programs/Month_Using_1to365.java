package assessments;

public class Month_Using_1to365 {
	
	public static void main(String[] args) {

		for (int i=1;i<= 365;i++) {
			
			if(i<=31) {
				System.out.println("January");
			}
			else if(i<=59) {
				System.out.println("Feb");
			}
			else if(i<=90) {
				System.out.println("March");
			}
			else if(i<=120) {
				System.out.println("April");
			}
			else if(i<=151) {
				System.out.println("May");
			}
			else if(i<=181) {
				System.out.println("June");
			}
			else if(i<=212) {
				System.out.println("July");
			}
			else if(i<=243) {
				System.out.println("Aug");
			}
			else if(i<=273) {
				System.out.println("Sep");
			}
			else if(i<=304) {
				System.out.println("Oct");
			}
			else if(i<=334) {
				System.out.println("Nov");
			}
			else if(i<=365) {
				System.out.println("December");
			}
			else {
				System.out.println(i);
			}
			
		}
	}

}
