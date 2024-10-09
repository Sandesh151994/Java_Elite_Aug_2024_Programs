package penta.java.collection;
import java.util.*;
public class SetTest {

	public static void main(String[] args) {
		
		
		Set<String> set= new HashSet<>();
		set.add("Virat Kohli");
		set.add("Smriti Mandana");
		set.add("Rohit Sharma");
		set.add("Ms Dhoni");
		set.add("Abd");
		set.add("Gautham Gambhir");
		set.add("R Ashwin");
		set.add("Pankaj");
		set.add("Maxi");
		set.add("Rohit Sharma");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.contains("Maxi"));

	}

}
