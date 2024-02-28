package assessments;

import java.util.Scanner;

public class Reverse_My_Name {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s1.nextLine();
		
//		System.out.println(name);
		
		String reverse = "";
		
		for(int i = name.length()-1; i>=0;i--) {
			char ch = name.charAt(i);
//			System.out.println(ch);
			reverse = reverse+ch;
		}
		System.out.println(reverse);
		
		
		
	}

}
