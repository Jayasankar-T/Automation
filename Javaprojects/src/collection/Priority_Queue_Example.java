package collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue_Example {
	
	public static void main(String[] args) {
		PriorityQueue p1 = new PriorityQueue();
		p1.add(48);
		p1.add(12);
		p1.add(38);
		p1.add(48);
		
		System.out.println(p1); // Index also not possible
//		Collections.sort(p1); // Sort Not possible 
//		System.out.println(p1);
		
		
		PriorityQueue p2 = new PriorityQueue();
		p2.add(48);
		p2.add(12);
		p2.add(38);
		p2.add(48);
		p2.add("Jai");
		p2.add("Vasu");
		p2.add("Jai");
//		p2.add(null); //Null not possible
		
		System.out.println(p2);
	}

}
