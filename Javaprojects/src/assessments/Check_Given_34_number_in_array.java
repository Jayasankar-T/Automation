package assessments_task;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Given_34_number_in_array {
	
	public static void main(String[] args) {
		
		int[] input = new int[4];
		System.out.println("Enter the array values : ");
		Scanner s1 = new Scanner(System.in);
		
		for (int i =0;i<=input.length-1;i++) {
			input[i]= s1.nextInt();		
			
		}
//		System.out.println(Arrays.toString(input));
		
		for(int i=0;i<=input.length-1;i++) {
			if(input[i] == 34) {
				System.out.println("34 Number position in "+i+" Index position");
			}
			else {
				System.out.println("34 Number not there in the Array");
			}
		}
	}
		
}

