package basicprograms;

public class Constructors {
	
	Constructors(){
		System.out.println("This is my constructor");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");	
		subtract();
		Constructors c1 = new Constructors();
		c1.add();
	}
	
	void add() {
		System.out.println("This is my non-static method");
	}
	
	static void subtract() {
		System.out.println("This is my static method");
	}

}
