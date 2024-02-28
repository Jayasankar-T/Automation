package assessments;

import java.util.Arrays;
import java.util.Scanner;

public class Rectangle {
	
	public static void main(String[] args) {
		
	int numbers[] = new int[4];
	
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the numbers : ");
	for(int i= 0;i<=3;i++) {
		numbers[i]=s1.nextInt();
	}
	System.out.println(Arrays.toString(numbers));
	
	//Area of Rectangle area = l*b
	for(int i= 0;i<=numbers.length-1;i++) {
		
	int l = numbers[i] ;
	int b = numbers[i];
	int area = l*b;
	
	System.out.println("Area of Square : "+area);
	}
}
}