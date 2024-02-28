package basicprograms;

public class Special_Characters {
	
	public static void main(String[] args) {
		
		int count_of_digit = 0;
		int count_of_alpha = 0;
		int count_of_space = 0;
		
		String name = "auto batch 38 *&^";
		char c1[] =  name.toCharArray();
		
		for(int i = 0; i<name.length();i++) {
			
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
		System.out.println("My given input String "+name+" has "+count_of_alpha+" Alphabets in it");
		System.out.println("My given input String "+name+" has "+count_of_digit+" digits in it");
		System.out.println("My given input String "+name+" has "+count_of_space+" spaces in it");
		
		if(name.length()==(count_of_alpha+count_of_digit+count_of_space)) {
			
			System.out.println("Given String have No special characters");
		}
		else {
			System.out.println("Given String have special characters");
		}
		
		
	}

}
