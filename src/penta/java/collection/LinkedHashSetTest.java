package penta.java.collection;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
	
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		System.out.println(lhs.hashCode());
		lhs.add(123);
		lhs.add(345);
		lhs.add(678);
		lhs.add(890);
		lhs.add(null);
		lhs.add(654);
		lhs.add(123);
		
		
		
		lhs.add(null);
		System.out.println(lhs);
		

	}

}
