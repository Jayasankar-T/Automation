package basicprograms;
import java.util.Arrays;

public class Class28_String {
	
	public static void main(String[] args) {
		String name = "50cent";
		int noofchar = 0;
		int noofint = 0;
		char a1[] = name.toCharArray();
		
		System.out.println(Arrays.toString(a1));		
		for(int i =0;i<a1.length;i++) {
			boolean answer = Character.isAlphabetic(a1[i]);
			
			Character.isDigit(0);
			if(answer == true) {
				noofchar++;
			}
			else {
				noofint++;
			}
		}
		System.out.println("the number of alphabets are :->"+noofchar);
		System.out.println("the number of alphabets are :->"+noofint);
	}

}
