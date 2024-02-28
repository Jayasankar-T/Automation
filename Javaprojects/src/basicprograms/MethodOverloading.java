package basicprograms;

public class MethodOverloading {

	static void add(int a, double b) {
		System.out.println(a);
		System.out.println(b);
		double c = a*b;
		System.out.println(c);

	}

	static void add(double a, int b) {
		System.out.println(a);
		System.out.println(b);
		double c = a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		add(9.3, 100);
		add(1100, 7.65);

	}

}
