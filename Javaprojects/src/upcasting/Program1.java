package upcasting;
class Program2{
	
	void add() {
		System.out.println("ADD");
	}
	
	void substract() {
		System.out.println("Substract");
	}
}

public class Program1 extends Program2 {
	
	void multiple() {
		System.out.println("Multiple");
	}
	
	public static void main(String[] args) {
		
		Program2 p = new Program1();//upcasting
		p.add();
		p.substract();
//		p.multiple();
		
		Program2 p1 = new Program1();
		Program1 p2 = (Program1) p1;
		p2.add();
		p2.substract();
		p2.multiple();
		
		
	}

}
