package assessments_task;
public class Assessment2_ConstructorsOverloading {
	
	Assessment2_ConstructorsOverloading(){
		System.out.println("Constructor with No-Arguments");
	}
	
	Assessment2_ConstructorsOverloading(int a){
		System.out.println("Constructor with Integer type arguments");
	}
	
	Assessment2_ConstructorsOverloading(boolean b){
		System.out.println("Constructor with Boolean type arguments");
	}
	
	Assessment2_ConstructorsOverloading(String b){
		System.out.println("Constructor with String type arguments");
	}
	
	Assessment2_ConstructorsOverloading(char a){
		System.out.println("Constructor with Char type arguments");
	}
	public static void main(String[] args) {
		new Assessment2_ConstructorsOverloading();
		new Assessment2_ConstructorsOverloading(9);
		new Assessment2_ConstructorsOverloading(true);
		new Assessment2_ConstructorsOverloading('a');
		new Assessment2_ConstructorsOverloading("Automation");	
	}

}
