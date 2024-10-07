package penta.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Product
{
		int pid;
		String pname;
		double price;
		int quantity;
		public Product(int pid, String pname, double price, int quantity) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.price = price;
			this.quantity = quantity;
		}
		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + "]\n";
		}
		
}
public class IteratorTest {

	public static void main(String[] args) {
		
		
		Product p1=new Product(111,"Samsung",50000,10);
		Product p2=new Product(222,"OnePlus",30000,15);
		Product p3=new Product(333,"Redmi",10000,5);
		Product p4=new Product(444,"Nothing",30000,3);
		
		ArrayList<Product> phonelist=new ArrayList<>();
		
		Collections.addAll(phonelist, p1,p2,p3,p4);
		System.out.println(phonelist);
		
		Iterator<Product> itr=phonelist.listIterator();
		while(itr.hasNext())
		{
			if(itr.next().quantity<10)
			{
				itr.remove();
			}
		}
		System.out.println("After removing");
		System.out.println(phonelist);
	}

}
