package assessments;

public class SIB_IIB_Blocks {
	
	SIB_IIB_Blocks(){
		System.out.println("Constructor without parameters");
	}
	SIB_IIB_Blocks(int a){
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
		
		SIB_IIB_Blocks b1 = new SIB_IIB_Blocks();
		System.out.println("Main Method");
		new SIB_IIB_Blocks();
		
	}
}
