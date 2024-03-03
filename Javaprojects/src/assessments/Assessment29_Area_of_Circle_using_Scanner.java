package assessments_task;
import java.util.Scanner;

public class Assessment29_Area_of_Circle_using_Scanner {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Radius : ");
		Scanner s1 = new Scanner(System.in);
		
		int radius = s1.nextInt();
		
		double pi = 3.14;
		
		double areaofcircle = pi*radius*radius;
		
		System.out.println("Area of Circle : "+areaofcircle);
	}
}
