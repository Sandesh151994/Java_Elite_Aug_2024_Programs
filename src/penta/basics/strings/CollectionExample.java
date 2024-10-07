package penta.basics.strings;

import java.util.*;
public class CollectionExample {

	public static void main(String[] args) {
		
		
		List list=new ArrayList();
		
		list.add(12);
		list.add("XYZ");
		list.add('A');
		list.add(45.34f);
		list.add(12);
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("Faizan");
		list1.add("Shilpa");
		list1.add("Jinendra");
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
			
		}
		
		for(String name:list1)
		{
			System.out.println(name);
		}
		
		list1.forEach(System.out::println);
		
		list1.forEach((n)->System.out.println(n));
		
		
		

	}

}
