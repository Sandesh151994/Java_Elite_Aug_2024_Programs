package penta.java.collection;

import java.util.Collections;
import java.util.HashSet;

class Address {
	String city;
	String state;
	String country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]\n";
	}

}

class User_Registration {
	String username;
	String email;
	String password;
	Address add;

	public User_Registration(String username, String email, String password, Address add) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.add = add;
	}

	@Override
	public String toString() {
		return "User_Registration [username=" + username + ", email=" + email + ", password=" + password + ", add="
				+ add + "]\n";
	}

}

public class UserRegistrationTest {

	public static void main(String[] args) {


		Address add1=new Address("Bangalore","Karnataka","India");
		Address add2=new Address("Mysore","Karnataka","India");

		User_Registration user1=new User_Registration("Shilpa","shilpa@gmail.com","123@sh",add1);
		User_Registration user2=new User_Registration("Karthik","karthik@gmail.com","kar@123",add2);
		User_Registration user3=new User_Registration("Akash","akash@gmail.com","akash@2000",add2);
		System.out.println(add1);;
		HashSet<User_Registration> users=new HashSet<>();
		Collections.addAll(users, user1,user2,user3,user1);

		System.out.println(users);
		System.out.println(users.hashCode());

		System.out.println(add1.hashCode());

	}

}
