package upcasting;

class Grand_Parent{
	
	void add() {
		System.out.println("ADD");
	}
	
}

class Parent extends Grand_Parent{
	
	void substract() {
		System.out.println("Substract");
	}
	
}

public class Casting extends Parent{
	
	void multiple() {
		System.out.println("Multiple");
	}
	public static void main(String[] args) {
		
		Parent p = new Casting();
		p.add();
		p.substract();
		
		Grand_Parent p1 = new Casting();
		
		Casting c = (Casting) p1;
		c.multiple();
		
	}

}
