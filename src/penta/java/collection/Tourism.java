package penta.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

class Places
{
	String place_name;
	String city;
	String state;
	public Places(String place_name, String city, String state) {
		super();
		this.place_name = place_name;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Places [place_name=" + place_name + ", city=" + city + ", state=" + state + "]\n";
	}
	
}
class PlaceNameComparator implements Comparator<Places>
{

	@Override
	public int compare(Places p1, Places p2) {
		// TODO Auto-generated method stub
		return p1.place_name.compareTo(p2.place_name);
	}
	
}
public class Tourism {

	public static void main(String[] args) {
		
		Places p1=new Places("Aramane","Mysore","Karnataka");
		Places p2=new Places("Panjim","Goa","Goa");
		Places p3=new Places("Kodaikenal","Dindikal","Tamilnadu");
		Places p4=new Places("Edakkal Caves","Kalpeta","Wayanad");
		Places p5=new Places("Ram jhula","Rishikesh","Uttarkand");
		
		PlaceNameComparator comp=new PlaceNameComparator();
		TreeSet<Places> places=new TreeSet<Places>(comp);
		places.add(p1);
		places.add(p2);
		places.add(p3);
		places.add(p4);
		places.add(p5);
		
		System.out.println(places);

	}

}
