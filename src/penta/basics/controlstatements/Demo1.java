package penta.basics.controlstatements;

class Operations
{
	static int i=20;

	static void print()
	{
		i=30;
		System.out.println(i);
	}
	
	int num=40;
	
	static void disp()
	{
		System.out.println(num);
	}
	

	
}
public class Demo1 {
	
	public static void main(String[] args) {
		
		
		Operations.print();
		
		Operations.i=50;
	
		System.out.println(Operations.i);
		
		
		
		
		
	
	}

}
