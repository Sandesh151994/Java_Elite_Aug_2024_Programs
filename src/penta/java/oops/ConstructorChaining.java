package penta.java.oops;

class Bike
{
	String name;
	String engine;
	double price;
	Bike()
	{
		this("Pulsar");// constructor calling statement
		System.out.println("Constructor-1");
	}
	Bike(String name)
	{
		this("Rx","100");
		this.name=name;
		System.out.println("Bike name "+this.name);
		System.out.println("Constructor-2");
	}
	Bike(String name,String engine)
	{
		this.name=name;
		this.engine=engine;
		
		System.out.println("Bike name "+this.name);
		System.out.println("Engine "+this.engine);
		System.out.println("Constructor-3");
		
	}
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
		
		Bike b1=new Bike();	

	}

}
