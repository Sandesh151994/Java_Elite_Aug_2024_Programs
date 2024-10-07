package penta.java.oops;

class Parent
{
	String pname="Sai Kumar";
	int age=50;
	String property="30acres";
	void details()
	{
		System.out.println("Parent Properties");
	}
}

class Child extends Parent
{
	String cname="Shivrajkumar";
	int age=30;
	void propertyDetails()
	{
		System.out.println("Parent Name "+pname);
		System.out.println("Parent Age "+age);
		System.out.println("Child Name "+cname);
		System.out.println("Child Age "+age);
		System.out.println("Property Detail "+property);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.details();
		c.propertyDetails();

	}

}
