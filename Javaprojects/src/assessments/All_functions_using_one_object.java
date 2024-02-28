package assessments;
import java.util.Scanner;

public class All_functions_using_one_object {
		
		void add(int i, int j) {
					
			int c = i+j;
			System.out.println("Addition of two numbers : "+ c);
		}
		void subtract(int i, int j) {
			
			int c = i-j;
			System.out.println("Subtract of two numbers : "+ c);
		}
		void multiple(int i, int j) {

			int c = i*j;
			System.out.println("Multiplication of two numbers : "+ c);
		}
		void division(int i, int j) {
			
			int c = i/j;
			System.out.println("Division of two numbers : "+ c);
		}
		public static void main(String[] args) {
			
			All_functions_using_one_object a1 = new All_functions_using_one_object();
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter value 1 : ");
			int a = s1.nextInt();
			
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter value 2 : ");
			int b = s1.nextInt();
			
			
			a1.add(a,b);
			a1.subtract(a,b);
			a1.multiple(a,b);
			a1.division(a,b);
		}
}
