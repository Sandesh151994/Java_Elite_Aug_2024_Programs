package penta.java.collection;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Car implements Comparable<Car>
{
	String brand;
	String name;
	double price;
	public Car(String brand, String name, double price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Brand : "+brand+" Name : "+name+" Price "+price+"\n";
	}

	@Override
	public int compareTo(Car c) {
		// TODO Auto-generated method stub
		return this.brand.compareTo(c.brand);
	}
	
	
}
public class ArrayListExample {

	public static void main(String[] args) {
		
		Car c1= new Car("Lamborgini","Aventador",53000000);
		Car c2= new Car("Toyata","Fortuner",6000000);
		Car c3= new Car("RollS Royce","Carnival",80000000);
		Car c4= new Car("Porsche","GT-3",40000000);
		
		System.out.println(c1);
		
		ArrayList<Car> carlist=new ArrayList<Car>();
		carlist.add(c1);
		carlist.add(c2);
		carlist.add(c3);
		carlist.add(c4);
		
		System.out.println(carlist);
		
		PriorityQueue<Car> pq=new PriorityQueue<Car>();
		pq.add(c1);
		pq.add(c2);
		pq.add(c3);
		pq.add(c4);
		System.out.println(pq);
		
		

	}

}
