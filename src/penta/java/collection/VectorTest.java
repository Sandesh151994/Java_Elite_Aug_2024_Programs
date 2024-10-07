package penta.java.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		
		Vector<String> vectors=new Vector<String>();
		vectors.add("Punith");
		vectors.add("Sudeep");
		vectors.add("Vijay");
		vectors.add("Yash");
		System.out.println("Legacy Methods");
		vectors.addElement("Darshan");
		System.out.println(vectors.elementAt(0));
		vectors.removeElement("Darshan");
		
		System.out.println(vectors.firstElement());
		System.out.println(vectors.lastElement());
		vectors.removeAllElements();
		
		Enumeration<String> en=vectors.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}

	}

}
