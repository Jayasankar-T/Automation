package assessments;

import java.util.Scanner;

public class Area_of_Circle_using_scanner {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter radius : ");
		
		int r = s1.nextInt();
		
		double AOC = 3.14*r*r;
		
		System.out.println("Area of Circle : "+ AOC);
	}

}
