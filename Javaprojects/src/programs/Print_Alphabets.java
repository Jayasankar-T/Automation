package assessments;

import java.util.Arrays;

public class Print_Alphabets {
	public static void main(String[] args) {
		
		String input = "world is full of beautiful people";
		
		int count_of_digit = 0;
		int count_of_alpha = 0;
		int count_of_space = 0;
	
		char c1[] =  input.toCharArray();
				
		for(int i = 0; i<input.length();i++) {
			boolean alpha = Character.isAlphabetic(c1[i]);
			if(alpha == true) {
				count_of_alpha++;
			}
			boolean digit = Character.isDigit(c1[i]);
			if(digit == true) {
				count_of_digit++;
			}
			boolean space = Character.isWhitespace(c1[i]);
			if(space == true) {
				count_of_space++;
			}			
		}
		System.out.println(input+" has "+count_of_alpha+" Alphabets");
		
		//Sorting Logic
		
		String sort = input.replaceAll(" ", "");
		char c2[] = sort.toCharArray();
		Arrays.sort(c2);
		System.out.println(c2);
	}
}



