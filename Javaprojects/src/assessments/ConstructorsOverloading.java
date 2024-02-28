package assessments;
public class ConstructorsOverloading {
	
	ConstructorsOverloading(){
		System.out.println("Constructor with No-Arguments");
	}
	
	ConstructorsOverloading(int a){
		System.out.println("Constructor with Integer type arguments");
	}
	
	ConstructorsOverloading(boolean b){
		System.out.println("Constructor with Boolean type arguments");
	}
	
	ConstructorsOverloading(String b){
		System.out.println("Constructor with String type arguments");
	}
	
	ConstructorsOverloading(char a){
		System.out.println("Constructor with Char type arguments");
	}
	public static void main(String[] args) {
		new ConstructorsOverloading();
		new ConstructorsOverloading(9);
		new ConstructorsOverloading(true);
		new ConstructorsOverloading('a');
		new ConstructorsOverloading("Automation");	
	}

}
