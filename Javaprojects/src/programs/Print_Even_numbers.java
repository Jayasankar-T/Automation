package assessments;

public class Print_Even_numbers {
	
	public static void main(String[] args) {
		
		for (int i=2;i<=100;i++) {
//			System.out.println(i);
			if(i%2==0) {
				System.out.println(i);
				i++;
				
			}
		}
	}

}
