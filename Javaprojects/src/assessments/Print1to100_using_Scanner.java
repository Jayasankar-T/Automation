package assessments;

import java.util.Scanner;

public class Print1to100_using_Scanner {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter vaue I : ");
		 
		int a = s1.nextInt();	
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter vaue J : ");
		
		int b = s2.nextInt();
	
		for(int i=a; i<=b;i++) {
			System.out.println(i);
		}
	}

}
