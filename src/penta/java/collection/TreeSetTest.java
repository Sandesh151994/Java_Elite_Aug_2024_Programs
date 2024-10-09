package penta.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> movies=new TreeSet<String>();
		movies.add("Bheema");
		movies.add("3 Idiots");
		movies.add("Interstellar");
		movies.add("Majili");
		movies.add("Googly");
		movies.add("Thumbad");
		System.out.println(movies);
		
		
		TreeSet<Integer> numbers=new TreeSet<>();
		numbers.add(23);
		numbers.add(12);
		numbers.add(89);
		numbers.add(21);
		numbers.add(54);
		numbers.add(60);
		System.out.println(numbers.ceiling(20));
		System.out.println(numbers.floor(57));
		
		System.out.println(numbers.higher(58));
		System.out.println(numbers.lower(20));
		System.out.println("====================");
		Iterator<Integer> itr=numbers.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		



	}

}
