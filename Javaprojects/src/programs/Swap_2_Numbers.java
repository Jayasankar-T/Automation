package assessments;

public class Swap_2_Numbers {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int swap ;
		
		System.out.println("Before Swap "+a+" value "+b+" value");
		
		swap = a;
		a = b;
		b = swap;
		
		System.out.println("After Swap "+a+" value "+b+" value");
	}

}
