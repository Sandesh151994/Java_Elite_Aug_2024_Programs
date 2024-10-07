package penta.basics.controlstatements;

public class Difference {
	
	static int num=1;
	void count()
	{
		System.out.println("Count = "+num);
		num++;
	}

	public static void main(String[] args) {
		
		Difference d1= new Difference();
		d1.count();
		
		Difference d2= new Difference();
		d2.count();
		
		Difference d3= new Difference();
		d3.count();
		
		Difference d4= new Difference();
		d4.count();

	}

}
