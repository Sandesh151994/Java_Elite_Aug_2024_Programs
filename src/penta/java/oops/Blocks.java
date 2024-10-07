package penta.java.oops;

public class Blocks {
	
	
	{
		// non static blocks are called when the object is created
		System.out.println("Calling Non Static block");
	}
	static int num;
	static
	{
		// static blocks are called before the main method
		
		num=400;
		System.out.println("Calling static blocks");
	}
	
	int num1=10;
	void disp()
	{
			Blocks b=new Blocks();
			System.out.println("Hello");
			System.out.println(num1);
			
	}

	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		Blocks b=new Blocks();
		b.disp();

	}

}
