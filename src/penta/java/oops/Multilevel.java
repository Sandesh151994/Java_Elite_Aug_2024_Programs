package penta.java.oops;


class Bicycle
{
	String name="Atlas";
	void features()
	{
		System.out.println(" Bicycle Features : Chain Pedals Handle");
	}
}

class MotorCycle extends Bicycle
{
	String name="Splendor";
	
	void motoFeatures()
	{
		super.features();
		System.out.println("MotorCycle Features: ");
		System.out.println("Name : "+super.name);
	}
}
class ElectricCycle extends MotorCycle
{
	void eleFeatures()
	{
		super.motoFeatures();
		System.out.println("ElectricCycle Feature: Battery ");
		System.out.println(super.name);
	}
}
public class Multilevel {

	public static void main(String[] args) {
		
		MotorCycle m=new MotorCycle();
		m.motoFeatures();
		
		ElectricCycle el=new ElectricCycle();
		el.eleFeatures();
		
		el.features();

	}

}
