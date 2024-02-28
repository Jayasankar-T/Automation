package basicprograms;

public class String_contains {
	
	public static void main(String[] args) {
		String name = "jai";
		String name2 = "Shankar";
		
		boolean b1 = name.contains("j");
		boolean b2 = name.matches("..i");
		boolean b3 = name2.matches("..a(.*)");
		
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
		
		System.out.println(name2.matches("S......"));
		System.out.println(name2.matches("(.*)n(.*)"));
	}

}
