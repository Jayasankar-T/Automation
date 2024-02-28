package inheritance;

class Parent_inheritance{
	void add() {
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}
}
public class Child_inheritance extends Parent_inheritance {
	
	void add() {
		
		int a = 50;
		int b = 50;
		System.out.println(a+b);
		super.add(); //Super Keyword
	}
	public static void main(String[] args) {
		Child_inheritance c1 = new Child_inheritance();
		c1.add();
		
	}

}
