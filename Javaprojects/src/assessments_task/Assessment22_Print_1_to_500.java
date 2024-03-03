package assessments_task;

public class Assessment22_Print_1_to_500 {
	
	public static void main(String[] args) {
		
		for (int i=1;i<=500;i++) {
			if(i%5==0 && i%3 == 0) {
				System.out.println("Computer & Mouse "+i);
			}
			else if(i%5==0) {
				System.out.println("Mouse "+i);
			}
			else if(i%3 == 0) {
				System.out.println("Computer "+i);
			}
		}
	}

}
