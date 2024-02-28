package assessments;

public class If_inside_If {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		if (a>0) {
			System.out.println("A is greater than '0'");
			if (a>=10) {
				System.out.println("A is greaterthan '10'");
				if(b>15) {
					System.out.println("B is greater than '15'");
					if (c==30) {
						System.out.println("C is greater than '30'");
					}
				}
			}
		}
		else {
			System.out.println("A is Less than '0");
		}
	}

}
