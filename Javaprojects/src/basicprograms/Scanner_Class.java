package basicprograms;
import java.util.Scanner;

public class Scanner_Class {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Plese enter value 1");
		int number1 = s1.nextInt();
		System.out.println("Plese enter value 2");
		int number2 = s1.nextInt();
		int sum = number1+number2;
		System.out.println("Addition of two numbers : "+sum);
		
		
	}

}
