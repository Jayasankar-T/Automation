package assessments_task;

public class Assessment37_String_Contains_Digits {
	
	public static void main(String[] args) {
		
		int isdigit = 0;
		int isalpha = 0;
		int isspace = 0;
		
		String name = "JaiShankar2303";
		char ch[] = name.toCharArray();
		for(int i=0;i<= name.length()-1;i++) {
			boolean alpha  = Character.isAlphabetic(i);
			if(alpha==true) {
				isalpha++;
			}
			boolean digit  = Character.isDigit(ch[i]);
			if(digit==true) {
				isdigit++;
			}
			boolean space  = Character.isSpace(ch[i]);
			if(space==true) {
				isspace++;
			}		
		}
		
		if(isdigit>0) {
			System.out.println("String Contains Digits");
		}
		else {
			System.out.println("String Does not Contains Digits");
		}
	}

}
