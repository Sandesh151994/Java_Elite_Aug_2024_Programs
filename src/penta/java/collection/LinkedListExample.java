package penta.java.collection;

import java.util.Collections;
import java.util.LinkedList;

class Drinks
{
	String brand;
	double quantity;
	int price;
	public Drinks(String brand, double quantity, int price) {
		super();
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Drinks [brand=" + brand + ", quantity=" + quantity + ", price=" + price + "]\n";
	}
	
	void disp()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Quantity : "+quantity);
		System.out.println("Price : "+price);
	}
	
}
public class LinkedListExample {

	public static void main(String[] args) {
		
		Drinks d1=new Drinks("Sidu's",0.18,1200);
		Drinks d2=new Drinks("Budwiser",.600,180);
		Drinks d3=new Drinks("Jack Daniels",1,4000);
		Drinks d4=new Drinks("Balentine",1,4200);
		Drinks d5=new Drinks("Black & White ",2,3400);
		
		LinkedList<Drinks> drinkslist= new LinkedList<>();
		
		Collections.addAll(drinkslist, d1,d2,d3,d4,d5);
		System.out.println(drinkslist);
		for (int i = 0; i < drinkslist.size(); i++) {
		
			if(drinkslist.get(i).price<1000)
			{
				drinkslist.remove(i);
			}
		}
		
		System.out.println("=======For Each Loop=======");
		for(Drinks drink:drinkslist)
		{
			drink.disp();
		}
		

	}

}
