package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Vector_Example {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		v1.add(46);
		v1.add(107);
		v1.add(17);
		v1.add(74);
		v1.add(17);
		
		
		System.out.println(v1.indexOf(74)); // Index is possible
		Collections.sort(v1); 
		System.out.println(v1);//Sort is possible
		
		Vector v2 = new Vector();
		v2.add(42);
		v2.add(42);
		v2.add(30);
		v2.add(78.986);
		v2.add("Jai");
		v2.add("Vasu");
		v2.add("Jai");
		v2.add(null); // null also possible
		
		
		System.out.println(v2); // Dynamic, Duplicate and Heterogeneous values possible 

	}

}
