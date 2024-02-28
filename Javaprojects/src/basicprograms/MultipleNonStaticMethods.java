package basicprograms;

public class MultipleNonStaticMethods
{
	void add()
	{
		System.out.println("1");
	}
	
	void subtract()
	{
		System.out.println("2");
	}
	
	public static void main(String[] args)
	{
		MultipleNonStaticMethods m1=new MultipleNonStaticMethods();
		
		m1.add();
		m1.subtract();
	}

}
