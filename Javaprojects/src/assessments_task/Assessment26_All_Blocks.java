package assessments_task;

public class Assessment26_All_Blocks {
	
	Assessment26_All_Blocks(){
		System.out.println("Constructor without parameters");
	}
	Assessment26_All_Blocks(int a){
		System.out.println("Constructor with int parameters");
	}
	static {
		System.out.println("SIB Block 1");
	}
	static {
		System.out.println("SIB Block 2");
	}
	{
		System.out.println("IIB Block 1");
	}
	{
		System.out.println("IIB Block 2");
	}
	
	public static void main(String[] args) {
		
		 new Assessment26_All_Blocks();
		System.out.println("Main Method");
		new Assessment26_All_Blocks(20);	
	}
}
