package assessments_task;
import java.util.Scanner;

public class Assessment30_Perform_Opertaions_using_Scanner {
	
	void add(int a, int b) {
		int add = a+b;
		System.out.println("Additon of A and B : "+ add);
	}
	void substract(int a, int b) {
		int add = a-b;
		System.out.println("Additon of A and B : "+ add);
	}
	void multiply(int a, int b) {
		int add = a*b;
		System.out.println("Additon of A and B : "+ add);
	}
	void division(int a, int b) {
		int add = a/b;
		System.out.println("Additon of A and B : "+ add);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter First Value: ");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		System.out.println("Enter Second Value: ");
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		
		Assessment30_Perform_Opertaions_using_Scanner a1 = new Assessment30_Perform_Opertaions_using_Scanner();
		
		a1.add(a, b);
		a1.substract(a, b);
		a1.multiply(a, b);
		a1.division(a, b);
		
	}

}
