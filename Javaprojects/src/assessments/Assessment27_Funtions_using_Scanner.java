package assessments_task;
import java.util.Scanner;
public class Assessment27_Funtions_using_Scanner {
	
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
		
		Assessment27_Funtions_using_Scanner a1 = new Assessment27_Funtions_using_Scanner();
		a1.add();
		a1.subtract();
		a1.multiple();
		a1.division();
	}

}
