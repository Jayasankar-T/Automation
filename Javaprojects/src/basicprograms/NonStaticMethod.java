package basicprograms;

public class NonStaticMethod {

	public static void main(String[] args)
	{
		NonStaticMethod n = new NonStaticMethod();
		n.add();

	}
	
	void add()
	{
		System.out.println("Addition");
	}

}
