package assessments;

public class Task1 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method opertaions");
		addition();
		subtraction();
		Task1 t1 = new Task1();
		t1.multiplication();
		t1.division();
		
	}
	
	void multiplication() {
		System.out.println("Multiplication");
	}
	
	void division() {
		System.out.println("Division");
	}
	
	static void addition() {
		System.out.println("Addition");
	}
	static void subtraction() {
		System.out.println("Subtraction");
	}
	
}
