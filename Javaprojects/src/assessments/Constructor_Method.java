package assessments;

public class Constructor_Method {
	
	Constructor_Method(){
		System.out.println("Constructor with No-Arguments");
	}
	
	Constructor_Method(int a){
		System.out.println("Constructor with int argument");
	}
	
	Constructor_Method(boolean b){
		System.out.println("Constructor with boolean argument");
	}
	
	Constructor_Method(String b){
		System.out.println("Constructor with String argument");
	}
	
	void method1(int a, double b, String c) {
		System.out.println("int: "+a+", double: "+b+", String: "+c);
	}
	
	void method1(double a, int b, String c) {
		System.out.println("double: "+a+", int: "+b+", String: "+c);
	}
	
	static void method1(String a, int b, double c) {
		System.out.println("String: "+a+", int: "+b+", double: "+c);
	}
	
	public static void main(String[] args) {
		Constructor_Method c1 = new Constructor_Method();
		new Constructor_Method(9);
		new Constructor_Method(true);
		new Constructor_Method("Automation");
		
		c1.method1(20,18.53,"Jai");
		c1.method1(12.5, 30, "Automation");
		Constructor_Method.method1("Shankar", 30, 20.9);
		
	}

}
