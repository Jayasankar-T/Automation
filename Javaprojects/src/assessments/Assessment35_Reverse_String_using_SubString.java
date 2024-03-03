package assessments_task;

public class Assessment35_Reverse_String_using_SubString {
	
	public static void main(String[] args) {
		
		String name = "RamMohan";
		String n2 = name.substring(0,3);
		String n3 = name.substring(3,8);
		String reverse =n3+n2;
		System.out.println(reverse);
	}

}
