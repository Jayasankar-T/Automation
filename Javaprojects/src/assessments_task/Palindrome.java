package assessments_task;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a Word Here : ");
		
		String name = s1.nextLine();
		
		String palindrome = "";
		
		for(int i= name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			palindrome = palindrome+ch;
		}
		
//		System.out.println(palindrome);
		
		if(name.equalsIgnoreCase(palindrome)) {
			System.out.println("Given word is an Palindrome");
		}
		else {
			System.out.println("Given word is not a Palindrome");
		}
	}

}
