package basicprograms;

public class While_Loop {
	
	public static void main(String[] args) {
		
		String name = "Jai Shankar";
		
		System.out.println(name.length());
		
		int size = name.length();
		
		while (size>=0) {
			System.out.println(name);
			size--;
		}
	}

}
