package exception_handling;

import java.util.InputMismatchException;

public class ThrowKeyWord {
	
	public static void main(String[] args) throws NullPointerException , InputMismatchException{
		
//		throw new NullPointerException();
		throw new NullPointerException("Hey your value is null");
		
	}

}
