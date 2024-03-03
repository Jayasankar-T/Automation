package assessments_task;

public class Assessment4_Constructor_Method_Overloading {
	
	Assessment4_Constructor_Method_Overloading(){
		System.out.println("Constructor with No-Arguments");
	}
	
	Assessment4_Constructor_Method_Overloading(int a){
		System.out.println("Constructor with int argument");
	}
	
	Assessment4_Constructor_Method_Overloading(boolean b){
		System.out.println("Constructor with boolean argument");
	}
	
	Assessment4_Constructor_Method_Overloading(String b){
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
		Assessment4_Constructor_Method_Overloading c1 = new Assessment4_Constructor_Method_Overloading();
		new Assessment4_Constructor_Method_Overloading(20);
		
		new Assessment4_Constructor_Method_Overloading(9);
		new Assessment4_Constructor_Method_Overloading(true);
		new Assessment4_Constructor_Method_Overloading("Automation");
		
		c1.method1(20,18.53,"Jai");
		c1.method1(12.5, 30, "Automation");
		method1("Shankar", 30, 20.9);
	}
}
