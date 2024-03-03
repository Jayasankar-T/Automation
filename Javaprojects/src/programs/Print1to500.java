package assessments;

public class Print1to500 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=500;i++) {
			

			if (i% 3 == 0) {
//				System.out.println("Computers"+i);
				if (i%3 ==0 && i%5 == 0) {
					System.out.println("Computers & Mouse"+i);
				}
				else {
					System.out.println("Computers"+i);
				}
			}
			if(i%5 == 0){
				System.out.println("Mouse"+i);
			}
			
		}
	}

}
