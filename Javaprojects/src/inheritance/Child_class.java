package inheritance;

class Grand_Class{
	
	Grand_Class(){
		System.out.println("Grand Parent Constructor");
	}
}

class ParentClass extends Grand_Class{
	
	ParentClass(){
		System.out.println("Parent Constructor");
	} 	
}

public class Child_class extends ParentClass {
	Child_class(){
		super();
		System.out.println("Child Constructor");
	}
	
	public static void main(String[] args) {
//		new Child_class();
		new ParentClass();
		
	}

}
