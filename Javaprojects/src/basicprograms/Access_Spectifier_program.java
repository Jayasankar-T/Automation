package basicprograms;

public class Access_Spectifier_program {
	
	public static void add() {
		int a =10;
		System.out.println(a);
	}
	private void subtract() {
		int b =20;
		System.out.println(b);
	}
	protected void multiply() {
		int c = 30;
		System.out.println(c);
	}
	static void division() {
		int d = 40;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Access_Spectifier_program a = new Access_Spectifier_program();
		a.add();
		a.subtract();
		a.multiply();
		a.division();
		
	}

}
