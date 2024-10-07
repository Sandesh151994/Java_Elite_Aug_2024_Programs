package penta.java.oops;
/*
 * 
 * accessspecifier ClassName()
 * {
 * 
 * }
 * 
 * public Person(parlist)
 * {
 * 
 * 
 * }
 */

class Person
{
	String name;
	
	int age;
	
	Person()
	{
//		System.out.println("Constructor with No parameter");
		
	}
	
	Person(String n)
	{
		name=n;
//		System.out.println(" Calling Parameterised constructor");
		
	}
	Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	final Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	 void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		Person p=new Person();
		p.display();
		
		Person p1=new Person("Karthik");
		p1.display();
		
		Person p2=new Person(25,"Akash");
		p2.display();
		
		Person p3=new Person("Abhirami",26);
		p3.display();
	}

}
