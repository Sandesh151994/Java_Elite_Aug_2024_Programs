package penta.java.oops;

class Address
{
	String city;
	String state;
	String country;
	int pincode;
	 Address(String city, String state, String country, int pincode) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}	
}

class Persons
{
	String name;
	int age;
	Address add;
	Persons(String name, int age, Address add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}
	
}
public class Aggregation {

	public static void main(String[] args) {
		
		
		Address address1=new Address("Hassan", "Karnataka", "India", 573116);
		
		Persons p1=new Persons("Sandesh",30,address1);
		
		System.out.println("Person Name : "+p1.name);
		System.out.println("Person age : "+p1.age);
		System.out.println("Address: ");
		System.out.println("City : "+p1.add.city);
		System.out.println("State : "+p1.add.state);
		System.out.println("Country : "+p1.add.country);
		System.out.println("Pincode : "+p1.add.pincode);

	}

}
