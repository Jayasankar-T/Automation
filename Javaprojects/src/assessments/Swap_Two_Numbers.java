package assessments;

public class Swap_Two_Numbers {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swap "+a+" value "+b+" value");
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap "+a+" value "+b+" value");
	}

}
