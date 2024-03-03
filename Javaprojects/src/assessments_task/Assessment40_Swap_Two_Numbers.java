package assessments_task;

public class Assessment40_Swap_Two_Numbers {
	public static void main(String[] args) {
		
		int a = 17;
		int b = 28;
		
		System.out.println("Before Swap "+a+" value "+b+" value");
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap "+a+" value "+b+" value");
	}

}
