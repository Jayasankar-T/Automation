package assessments;

public class String_Replace {
	
	public static void main(String[] args) {
		
		String name = "abhishek";
		String output = name.replace('a', 'n');
		
		System.out.println(output);
		
		String n2 = name.replaceAll("h", "");
		System.out.println(n2);
		
		String n3 = "GroTechMind";
		String	o = n3.replaceAll("[a-z]", "");
		System.out.println(o);
		
		String n4 = "GroTechMind";
		String	lo = n4.replaceAll("[A-Z]", "");
		System.out.println(lo);
	}

}
