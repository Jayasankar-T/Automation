package assessments_task;

import java.util.Scanner;

public class Assessment38_Factorial_Of_Numbers {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The Value : ");
		int number = s1.nextInt();
		int factorial = 1 ;
		
		for(int i = 1;i<=number;i++) {
			
			factorial= factorial*i;

		}
		System.out.println("Factorial of "+number+" is "+factorial);
	}

}
