package basicprograms;

abstract class Login{
	abstract void login();
}

public class AbstractClass extends Login {
	
	public static void main(String[] args) {
		
		AbstractClass c1 = new AbstractClass();
		c1.login();
		
	}

	@Override
	void login() {
		System.out.println("The real code");
		
	}
	
	

}
