package basicprograms;

import java.util.Arrays;

public class Array_Class3 {
	
	public static void main(String[] args) {
		int array1[] = new int[4];
		array1[0] = 76;
		array1[1] = 79;
		array1[2] = 96;
		array1[3] = 20;
		
		int array2[] = new int[4];
		
		for(int i= 0;i<array1.length;i++) {
			
			array2[i] = array1[i];
		}
		System.out.println("Array 1 : "+Arrays.toString(array1));
		System.out.println("Array 2 : "+Arrays.toString(array2));
		
		System.out.println(Arrays.equals(array1, array2));
	}

}
