package assessments_task;

class Child1{
	void add() {
		System.out.println("Add Method");
	}
}

class Child2 extends Child1{
	void substract() {
		System.out.println("Substract method");
	}
}

class Child3 extends Child2{
	void multiple() {
		System.out.println("Mutiple method");
	}
}

public class Assessment41_Upcasting_and_Downcasting extends Child3{
	
	void division() {
		System.out.println("Division method");
	}
	
	public static void main(String[] args) {
		
		Child3 c1 = new Assessment41_Upcasting_and_Downcasting();
		
		Assessment41_Upcasting_and_Downcasting a1 = (Assessment41_Upcasting_and_Downcasting)  c1;
		
		
		a1.add();
		a1.substract();
		a1.multiple();
		a1.division();
		
	}

}
