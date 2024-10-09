package penta.java.collection;
import java.util.*;
import java.util.Map.Entry;
//class Restaurant
//{
//	String rname;
//	String area;
//	double price;
//	public Restaurant(String rname, String area, double price) {
//		super();
//		this.rname = rname;
//		this.area = area;
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "[rname=" + rname + ", area=" + area + ", price=" + price + "]\n";
//	}
//	
//	void disp()
//	{
//		System.out.println("Restaurant Name : "+rname);
//		System.out.println("Area : "+area);
//		System.out.println("Price Range : "+price);
//	}
//	
//}
public class HashMapTest {

	public static void main(String[] args) {
		
		Restaurant r1=new Restaurant("Empire","Koramangala",500);
		Restaurant r2=new Restaurant("Nagarjuna's","Koramangala",1000);
		
		Restaurant r3=new Restaurant("MTR","JP Nagar",500);
		Restaurant r4=new Restaurant("Basaweshwara Khanavali","Jayanagar",350);
		Restaurant r5=new Restaurant("Mallika Biriyani","Hebbal",1000);
		Restaurant r6=new Restaurant("Ambur Biriyani","BTM",100);
		
		HashMap<String,Restaurant> rest=new HashMap<>();
		
		rest.put("Em",r1);
		rest.put("Nag", r2);
		rest.put("MTR", r3);
		rest.put("BK", r4);
		rest.put("Malli", r5);
		rest.put("Ambu", r6);
		
		System.out.println(rest);
		System.out.println("==================");
//		for(Restaurant r:rest.values())
//		{
//			r.disp();
//		}
//		
		for(Entry<String, Restaurant> entry:rest.entrySet())
		{
			System.out.println("Key : "+entry.getKey());
			
//			Restaurant r=entry.getValue();
//			r.disp();
			entry.getValue().disp();
		}
		
		
	}

}
