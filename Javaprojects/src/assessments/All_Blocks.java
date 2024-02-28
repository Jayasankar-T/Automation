package assessments;

public class All_Blocks {
	
	All_Blocks(){
		System.out.println("Constructor without parameters");
	}
	All_Blocks(int a){
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
		
		All_Blocks b1 = new All_Blocks();
		System.out.println("Main Method");
		new All_Blocks(20);	
	}
}
