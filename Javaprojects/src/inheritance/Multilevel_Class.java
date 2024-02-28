package inheritance;
interface Authentication{
	void un();
	void pwd();
}
abstract class LoginToAmazon implements Authentication{
	
	abstract void credentials();
	static void otp() {
		System.out.println("OTP will be provided");
	}
}

public class Multilevel_Class extends LoginToAmazon{

	public static void main(String[] args) {
		Multilevel_Class m1 = new Multilevel_Class();
		m1.credentials();
		m1.un();
		m1.pwd();
		Multilevel_Class.otp();
	}

	@Override
	public void un() {
		System.out.println("Username");
		
	}

	@Override
	public void pwd() {
		System.out.println("Password");
		
	}

	@Override
	void credentials() {
		System.out.println("Credentials");
		
	}
}
