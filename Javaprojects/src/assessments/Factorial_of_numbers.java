package assessments;
import java.util.*;

public class Factorial_of_numbers {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = s1.nextInt();
		int fact = 1;
		
		for(int i =number; i>0;i--) {
//			System.out.println(i);
			fact = fact*i;
		}
		System.out.println("Factorial of "+number+" is : "+fact);
	}

}
