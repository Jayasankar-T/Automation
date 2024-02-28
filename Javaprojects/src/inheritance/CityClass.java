package inheritance;

abstract class CountryClass{
	
	abstract void nh_road();
	static void add() {
		System.out.println("1");
	}
}

abstract class StateClass extends CountryClass{
	
	abstract void state_road();
	
	void subtract() {
		System.out.println("2");
	}
}

public class CityClass extends StateClass{
	
	void multi() {
		System.out.println("3");
	}
	
	void divi() {
		System.out.println("4");
	}
	
	public static void main(String[] args) {

		CityClass c1 = new CityClass();
		c1.nh_road();
		c1.state_road();
		
	}
	void nh_road() {
		System.out.println("5");
	}
	
	void state_road() {
		System.out.println("6");
	}

}
