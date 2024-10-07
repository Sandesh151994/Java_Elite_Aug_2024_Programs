package penta.java.oops;

class Bottle
{
	String type;
	float quantity;
	void fill(String type)
	{
		this.type=type;
		System.out.println(type+" Of content I can fill");
	}
	void fill(String type,float quantity)
	{
		this.type=type;
		this.quantity=quantity;
		System.out.println(type+" Of content I can fill with "+quantity+" ltr");
	}
	
}
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		
		Bottle b=new Bottle();
		b.fill("Water");
		b.fill("Beer",1.5f);

	}

}
