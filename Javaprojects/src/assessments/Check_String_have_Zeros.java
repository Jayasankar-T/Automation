package assessments;

import java.util.Arrays;

public class Check_String_have_Zeros {
		
	public static void main(String[] args) {
			String name = "567843cent";
			int noofchar = 0;
			int noofint = 0;
			char a1[] = name.toCharArray();
			
			System.out.println(Arrays.toString(a1));		
			for(int i =0;i<a1.length;i++) {
				boolean answer = Character.isDigit(a1[i]);
				if(answer == true) {
					noofint++;
				}
				else {
					noofchar++;
				}
			}
			System.out.println("the number of alphabets are :->"+noofchar);
			System.out.println("the number of alphabets are :->"+noofint);
			
			if(noofint >0) {
				System.out.println("Given string have numbers");
			}
			else{
				System.out.println("Given string does not have numbers");
			}
		}
}
