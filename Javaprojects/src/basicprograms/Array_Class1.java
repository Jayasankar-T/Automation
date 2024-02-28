package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Class1 {
	
	public static void main(String[] args) {
		int rollno[] = new int[4];
		Scanner s1 = new Scanner(System.in);
		
		for (int i = 0;i<=3;i++) {
			
			System.out.println("Please Enter the Value : ");
			
			rollno[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		
		
		
	}

}
