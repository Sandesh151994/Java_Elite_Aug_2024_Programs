package penta.java.oops;

class Watch
{
	String brand;
	double price;
	String type;
	Watch(String brand,double price,String type)
	{
		this.brand=brand;
		this.price=price;
		this.type=type;
	}
	
	Watch(Watch w)
	{
		brand=w.brand;
		price=w.price;
		type=w.type;
	}

}
public class CopyConstructor {

	public static void main(String[] args) {
		
		Watch w1=new Watch("Rolex",50000,"Analog");
		
//		w1.getDetails();
		
		Watch w2=new Watch(w1);
		
//		System.out.println("Copied from another constructor");
	
//		w2.getDetails();
		
		Watch watcharr[]= {w1,w2};
		System.out.println(String.format("|%10s|", "Brand")+""+String.format("|%10s|","Price")+""+String.format("|%10s|","Type"));
		System.out.println(String.format("|%10s|", "----------")+""+String.format("|%10s|", "----------")+""+String.format("|%10s|", "----------"));
		for(Watch w:watcharr)
		{
			
			System.out.println(String.format("|%10s|", w.brand)+""+String.format("|%10g|", w.price)+""+String.format("|%10s|", w.type));
			System.out.println(String.format("|%10s|", "----------")+""+String.format("|%10s|", "----------")+""+String.format("|%10s|", "----------"));
		}
		
	}

}
