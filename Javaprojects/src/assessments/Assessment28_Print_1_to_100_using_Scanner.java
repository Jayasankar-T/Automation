package assessments_task;

import java.util.Scanner;

public class Assessment28_Print_1_to_100_using_Scanner {
	
	public static void main(String[] args) {
		
		System.out.println("Enter First Value : ");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		System.out.println("Enter Second Value : ");
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		
		for(int i=a;i<=b;i++) {
			System.out.println(i);
		}
	}

}
