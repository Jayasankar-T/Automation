package exception_handling;

import java.util.Scanner;

public class Asset_pratice {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int input =s1.nextInt();
		assert input>10:"Hey your input is less than 10 so stopping you";
		int a = 100;
		int b = 200;
		int sum = a+b;
		System.out.println(sum);
	}

}
