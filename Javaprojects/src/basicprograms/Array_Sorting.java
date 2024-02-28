package basicprograms;

import java.util.Arrays;
import java.util.Collections;

public class Array_Sorting {
	
	public static void main(String[] args) {
		
//		String name = "world";
//		char c1[] =name.toCharArray();
		
		int c1[] = new int[3];
		c1[0] = 98;
		c1[1] = 95;
		c1[2] = 21;
 		System.out.println("Before Sort");
		System.out.println(Arrays.toString(c1));
		
		Arrays.sort(c1);
		System.out.println("After Sort");
		System.out.println(Arrays.toString(c1));
		
//		Arrays.sort(c1, Collections.reverseOrder());
		Arrays.sort(c1);
		
	}

}
