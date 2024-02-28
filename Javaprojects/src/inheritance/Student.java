package inheritance;

public class Student extends Teacher{
	
	static void learning_java() {
		System.out.println("Learning Java");
	}
	
	static void learning_selenium() {
		System.out.println("Learning Selenium");
	}
	
	public static void main(String[] args) {
		
		learning_java();
		learning_selenium();
		java_knowledge();
		selenium_knowledge();
		
	}

}
