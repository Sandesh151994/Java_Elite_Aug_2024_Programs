package penta.java.oops;

class Engine
{
	
	void start()
	{
		System.out.println(" Starting the vehicle");
	}
	void stop()
	{
		System.out.println(" Stopping the vehicle");
	}
}
class Car
{
	String carname;
	String maxspeed;
	double price;
	final Engine engine;
	Car(String carname,String maxspeed,double price)
	{
		this.carname=carname;
		this.maxspeed=maxspeed;
		this.price=price;
		engine=new Engine();
	}
	
}
public class Composition {

	public static void main(String[] args) {
		
		
		Car c=new Car("Maruti-800","200km/h",100000);
		c.engine.start();
		c.engine.stop();
		
		
		

	}

}
