package basicprograms;

public class GloableVariable {
	
	int age;
	String name;
	double salary;
	
	void add(int age, String name, double salary) {
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		
		GloableVariable g1 = new GloableVariable();
		g1.add(58, "Jai", 4000.85);
		System.out.println(g1.age);
		System.out.println(g1.name);
		System.out.println(g1.salary);
	}

}
