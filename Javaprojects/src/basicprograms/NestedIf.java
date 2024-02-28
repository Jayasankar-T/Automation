package basicprograms;

public class NestedIf {
	public static void main(String[] args) {
		
		int a = 300;
		int b = 400;
		
		
		 if (a<b) {
			 if (a<500) {
				 System.out.println("Logic 1");
				 
			 }
			 else {
				 System.out.println("Logic 2");
			 }
		 }
		 else {
			 System.out.println("Logic 3");
		 }
	}

}
