package assessments_task;

public class Assessment5_UpdateValue {
	
	public static void main(String[] args) {
		Assessment5_UpdateValue d1 = new Assessment5_UpdateValue();
//		d1.byte_method(3);
//		d1.short_method(3);
		d1.int_method(2, 3);
		d1.long_method(2, 3);
		d1.float_method(20.00f, 30.00f);
		d1.double_method(20, 30);
		d1.char_method('a');
		d1.boolean_method(false);
		d1.string_method("Jai");
		
	}
	
	void byte_method(byte i) {
		System.out.println("Byte value: "+i);
		i = 40;
		System.out.println("Byte value: "+i);
	}
	
	void short_method(short i) {
		System.out.println("short value: "+i);
		i = 400;
		System.out.println("short value: "+i);
	}
	
	void int_method(int a, int b) {		
		a = 25;
		b = 35;
		System.out.println("A value:"+a+", B value:"+b);		
	}
	
	void long_method(long a, long b) {		
		a = 2000;
		b = 3000;
		System.out.println("A value:"+a+", B value:"+b);		
	}
	
	void float_method(float a, float b) {		
		a = 23.0f;
		b = 300.0f;
		System.out.println("A value:"+a+", B value:"+b);		
	}
	
	void double_method(double a, double b) {		
		a = 23.1560;
		b = 300.134560;
		System.out.println("A value:"+a+", B value:"+b);		
	}
	void char_method(char a) {
		System.out.println("Char value:"+a);
		a = 'c';
		System.out.println("Char value:"+a);
	}
	
	void boolean_method(boolean a) {
		System.out.println("Boolean value: "+a);
		a = true;
		System.out.println("Boolean value: "+a);
	}
	
	void string_method(String a) {
		String b = a+" Shankar";
		System.out.println("String: "+b);
	}

}
