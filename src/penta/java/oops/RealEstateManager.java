package penta.java.oops;

class Property
{
	String address;
	double squareft;
	Property(String address, double squareft) {
		this.address = address;
		this.squareft = squareft;
	}
}
class ResidentialProperty extends Property
{
	
	String bedrooms;
	String hall;
	String kitchen;
	ResidentialProperty(String address, double squareft,
			String bedrooms, String hall, String kitchen) {
		super(address, squareft);
		this.bedrooms = bedrooms;
		this.hall = hall;
		this.kitchen = kitchen;
	}
	void resdetails()
	{
		System.out.println(" Address "+address);
		System.out.println("Square fit "+squareft);
		System.out.println("Bed Rooms : "+bedrooms);
		System.out.println("Hall : "+hall);
		System.out.println("Kitchen : "+kitchen);
	}
	
}
class CommercialProperty extends Property
{
	String leastType;
	String businessType;
	public CommercialProperty(String leastType, String businessType) {
		super("Bangalore", 1500);
		this.leastType = leastType;
		this.businessType = businessType;
	}
	void comdetails()
	{
		System.out.println(" Address "+address);
		System.out.println("Square fit "+squareft);
		System.out.println("Lease Type : "+leastType);
		System.out.println("BusinessType : "+businessType);
	}
}
public class RealEstateManager {

	public static void main(String[] args) {
		
		
		ResidentialProperty rp=new ResidentialProperty("Tumkur",1200,"2 Bed Rooms",
				"1 Hall","1 Kitchen");
		CommercialProperty cp=new CommercialProperty("Three Years","Retail");
		
		
		rp.resdetails();
		cp.comdetails();
		
	
	}

}
