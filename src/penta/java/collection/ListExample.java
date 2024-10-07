package penta.java.collection;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {

		
		List list=new ArrayList();
		list.add("Akash");
		list.add(12);
		list.add(12.34f);
		list.add('A');
		list.add(true);
		list.add(null);
		System.out.println(list);
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("Abhirami");//0
		list1.add("Karthik");//1
		list1.add("Gautham");//2
		list1.add("Chiranth");//3
		list1.add("Yeshwanth");//4
		list1.add("Faizan");//5
		System.out.println(list1);
		System.out.println(list1.size());
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

	}

}
