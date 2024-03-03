package assessments_task;

public class Assessment3_Method_Overloading {
	
	static void method1(String a, char b) {
		System.out.println("String: "+a+", Char: "+b);
	}
	
	static void method1(char a, String b) {
		System.out.println("Char: "+a+", String: "+b);
	}
	
	void method2(int a, int b, double c) {
		System.out.println("int:"+a+", int:"+b+", double:"+c);
	}
	
	void method2(double a, int b, int c) {
		System.out.println("double:"+a+", int:"+b+", int:"+c);
	}
	
	public static void main(String[] args) {
		
		Assessment3_Method_Overloading a1 = new Assessment3_Method_Overloading();
		
		method1("Jai", 'J');
		method1('J',"Shankar");
		a1.method2(10, 20, 25.1);
		a1.method2(12.5, 15, 10);
		
	}

}
