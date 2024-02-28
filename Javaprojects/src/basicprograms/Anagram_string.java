package basicprograms;

import java.util.Arrays;

public class Anagram_string {

	public static void main(String[] args) {
		String a1 = "listen";
		String a2 = "silent";
		 
		if(a1.length()!=a2.length()) {
			System.out.println("They are not anagram at all");
		}
		else {
			char c1[] = a1.toCharArray();
			char c2[] = a2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2)==true) {
				System.out.println("The given 2 strings are anagram of each others");
			}
			else{
				System.out.println("The given 2 strings are not anagram of each others");
				
			}
		}
		

	}

}
