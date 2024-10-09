package penta.java.collection;

import java.util.*;
class Mobile implements Comparable<Mobile>
{
	String brand;
	String name;
	double price;
	public Mobile(String brand, String name, double price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	void getDetails()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
	}
	@Override
	public int compareTo(Mobile m) {
		
		return (int) (this.price-m.price);
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", name=" + name + ", price=" + price + "]\n";
	}
	
}
class Restaurant
{
	String rname;
	String area;
	double price;
	public Restaurant(String rname, String area, double price) {
		super();
		this.rname = rname;
		this.area = area;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[rname=" + rname + ", area=" + area + ", price=" + price + "]\n";
	}
	
	void disp()
	{
		System.out.println("Restaurant Name : "+rname);
		System.out.println("Area : "+area);
		System.out.println("Price Range : "+price);
	}
	
}

public class MobileTest {

	public static void main(String[] args) {
		
		
		Mobile m1=new Mobile("Samsung","Galaxy A55",21000);
		Mobile m2=new Mobile("Apple ","Iphone 15",69999);
		Mobile m3=new Mobile("Xiaomi","Redmi 15 pro",15000);
		Mobile m4=new Mobile("OnePlus","11R",40000);
		Restaurant r1=new Restaurant("Empire","Koramangala",500);
		Restaurant r2=new Restaurant("Nagarjuna's","Koramangala",1000);
		
		Restaurant r3=new Restaurant("MTR","JP Nagar",500);
		
		LinkedHashMap<Object,String> mobiles=new LinkedHashMap<>();
		mobiles.put(m1, "Sam");
		mobiles.put(m2, "Ap");
		mobiles.put(m3, "Mi");
		mobiles.put(m4, "1+");
		mobiles.put(r1, "Em");
		mobiles.put(r2, "Nag");
		mobiles.put(r3, "MTR");
		
		System.out.println(mobiles);
		
//		for(Map.Entry<Object, String> entry:mobiles.entrySet())
//		{
//			System.out.println("Keyword : "+entry.getValue());
//			
//			entry.getKey().getDetails();
//			
//		}
		System.out.println("====================================");
		
		
		
//		TreeMap<Object,String> mobs=new TreeMap<>();
//		mobs.put(m1, "Sam");
//		mobs.put(m2, "Ap");
//		mobs.put(m3, "Mi");
//		mobs.put(m4, "1+");
//		for(Map.Entry<Mobile, String> entry:mobs.entrySet())
//		{
//			System.out.println("Keyword : "+entry.getValue());
//			
//			entry.getKey().getDetails();
//			
//		}
		

	}

}
