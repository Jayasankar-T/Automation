package assessments;

import java.util.Scanner;

public class Reverse_String_2 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String input = s1.nextLine();
		
		String output = "";
		
		for (int i= input.length()-1;i>=0;i--) {
			char ch = input.charAt(i);
			
			output = output+ch;
		}
		System.out.println(output);
	}

}
