package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List_Example {
	
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.add(21);
		l1.add(17);
		l1.add(74);
		
		
		System.out.println(l1.indexOf(17)); // Index is possible
		Collections.sort(l1); // 
		System.out.println(l1);// Sort is possible
		
		
		LinkedList l2 = new LinkedList();
		l2.add(42);
		l2.add(42);
		l2.add(30);
		l2.add(78.986);
		l2.add("Jai");
		l2.add("Vasu");
		l2.add("Jai");
		l2.add(null); // null also possible
		
		
		System.out.println(l2); // Dynamic, Duplicate and Heterogeneous values possible 
	}

}
