package basicprograms;

public class ConstructorExample {
	
	ConstructorExample(){
		System.out.println("This is my constructor");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		ConstructorExample c1 = new ConstructorExample();
		c1.add();
	}
	void add() {
		System.out.println("Non-static method");
	}

}
