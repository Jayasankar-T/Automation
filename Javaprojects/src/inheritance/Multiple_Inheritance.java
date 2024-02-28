package inheritance;

interface First_Parent {
	void add();
	
}

interface Second_Parent {
	void subtract();
}

public class Multiple_Inheritance implements First_Parent,Second_Parent {
	
	public static void main(String[] args) {
		Multiple_Inheritance m1 = new Multiple_Inheritance();
		m1.add();
		m1.subtract();
		
	}

	@Override
	public void subtract() {
		System.out.println("Substract");
		
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}

}
