package basicprograms;

public class String_Class {
	
	public static void main(String[] args) {
		
		String name = "Srilanka";
		int a = name.length();
		System.out.println(a);
		
		System.out.println(name.charAt(6));
		
		String name1 = " is my neighbour Country";
		System.out.println(name.concat(name1));
		
		System.out.println("Jai".concat(" ").concat("Shankar").concat(" ").concat("Thanneru"));
		
		System.out.println(name.indexOf('i'));
		
		String a2 = "I Love My Country";
		
		System.out.println(a2.trim());
	}

}
