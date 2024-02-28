package exception_handling;

public class Program1 {
	
	public static void main(String[] args) {
		
		
		try {
			int c = 1/0;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Since infinity can not be stored in the int data type. we handled it using Exception handling");
		}
		
	}

}
