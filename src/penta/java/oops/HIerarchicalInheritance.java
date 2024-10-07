package penta.java.oops;

class Animal
{
	Animal()
	{
		
	}
	void eat()
	{
		System.out.println("Eating....");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println(" Bow Bow");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Meow Meow");
	}
}
public class HIerarchicalInheritance {

	public static void main(String[] args) {
		
		
		Dog d=new Dog();
		d.bark();
		d.eat();
		
		Cat c=new Cat();
		
		c.sound();
		c.eat();
	}

}
