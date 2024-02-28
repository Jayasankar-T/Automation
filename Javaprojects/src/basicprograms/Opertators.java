package basicprograms;

public class Opertators {
	
	static void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
	}
	
	static void substract() {
		int a = 10;
		int b = 20;
		int c = b-a;
		System.out.println(c);
		
	}
	
	void mlutiply() {
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println(c);
		
	}
	void divide() {
		int a = 10;
		int b = 20;
		int c = b/a;
		System.out.println(c);
		
	}
	void reminder() {
		int a = 10;
		int b = 21;
		int c = b%a;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		add();
		substract();
		Opertators o1= new Opertators();
		o1.mlutiply();
		o1.divide();
		o1.reminder();
		
		
	}

}
