package penta.java.collection;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree=new TreeMap<>();
		tree.put(89, "Hello");
		tree.put(45, "World");
		tree.put(32, "Hi");
		tree.put(12, "Good");
//		tree.put(null, "Morning");
		
		System.out.println(tree);
		tree.putIfAbsent(12, "Morning");
		System.out.println(tree);

	}

}
