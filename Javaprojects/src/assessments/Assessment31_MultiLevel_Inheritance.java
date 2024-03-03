package assessments_task;

class Super_Most {
	static void supermost_add() {
		System.out.println("Supermost Add Method");
	}
	
	static void supermost_substract() {
		System.out.println("Supermost Substract Method");
	}
}

class Super_Class extends Super_Most{
	static void super_add() {
		System.out.println("Super Class Add Method");
	}
	
	static void super_substract() {
		System.out.println("Super Class Substract Method");
	}
}

class Sub_Class extends Super_Class{
	static void sub_add() {
		System.out.println("Sub Class Add Method");
	}
	
	static void sub_substract() {
		System.out.println("Sub Class Substract Method");
	}
}

public class Assessment31_MultiLevel_Inheritance extends Sub_Class{
	
	public static void main(String[] args) {
		
		Assessment31_MultiLevel_Inheritance a1 = new Assessment31_MultiLevel_Inheritance();
		a1.supermost_add();
		a1.super_add();
		a1.sub_add();
		
		a1.supermost_substract();
		a1.super_substract();
		a1.sub_substract();
	}

}
