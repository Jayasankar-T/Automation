package inheritance;

abstract class State_Class{
	
	abstract void statehighways();
}

public class City_Class extends State_Class {
	
	public static void main(String[] args) {
		
		City_Class c1 = new City_Class();
		c1.statehighways();
		
	}
	void statehighways() {
		System.out.println("The Internal Login");
	}

}
