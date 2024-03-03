package assessments_task;

public class Assessment25_SIB_IIB_Blocks {
	
	Assessment25_SIB_IIB_Blocks(){
		System.out.println("Constructor without parameters");
	}
	Assessment25_SIB_IIB_Blocks(int a){
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
		
		new Assessment25_SIB_IIB_Blocks();
		System.out.println("Main Method");
		new Assessment25_SIB_IIB_Blocks();
		
	}
}
