package assessments;
import java.util.*;

public class All_Functions_using_scanner {
	
	void add() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value 1 : ");
		int a = s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);	
		System.out.println("Enter value 2 : ");
		int b = s2.nextInt();
		
		int c = a+b;
		System.out.println("Addition of two numbers : "+ c);
	}
	
	void subtract() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value 1 : ");
		int a = s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);	
		System.out.println("Enter value 2 : ");
		int b = s2.nextInt();
		int c = a-b;
		System.out.println("Subtraction of two numbers : "+ c);
	}
	
	void multiple() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value 1 : ");
		int a = s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);	
		System.out.println("Enter value 2 : ");
		int b = s2.nextInt();
		int c = a*b;
		System.out.println("Multiplication of two numbers : "+ c);
	}
	
	void division() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value 1 : ");
		int a = s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);	
		System.out.println("Enter value 2 : ");
		int b = s2.nextInt();
		
		int c = a/b;
		System.out.println("Division of two numbers : "+ c);
	}
	
	public static void main(String[] args) {
		
		All_Functions_using_scanner a1 = new All_Functions_using_scanner();
		a1.add();
		a1.subtract();
		a1.multiple();
		a1.division();
	}
}
