package basicprograms;

public class This_keyword {
			
		int age;
		String name;
		double salary;
		
		void add(int age, String name,double salary) {
			this.age = age;
			this.name = name;
			
		}
		public static void main(String[] args) {
			
			Class21 c1 = new Class21();
			c1.add(21, "Vishnu", 8765.87);
			System.out.println(c1.age);
			
		}

}