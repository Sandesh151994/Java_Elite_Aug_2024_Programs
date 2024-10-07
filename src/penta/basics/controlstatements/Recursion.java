package penta.basics.controlstatements;

public class Recursion {

	static int count=1;
	static void print()
	{
		if(count<=5)
		{
			System.out.println("Count "+count);
			count++;
			print();
		}

	}
	public static void main(String[] args) {


		Recursion.print();

	}

}
