package assessments;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println("Enter the Value : ");
		Scanner s1 = new Scanner(System.in);
		String input = s1.nextLine();
		
		String output = "";
		
		for (int i=input.length()-1;i>=0;i--) {
			char ch = input.charAt(i);
			output = output+ch;
		}
		System.out.println(output);
		if(input.equalsIgnoreCase(output)) {
			System.out.println("Given Value is Palindrome");
		}
		else {
			System.out.println("Given value is not Palindrome");
		}
	}

}
