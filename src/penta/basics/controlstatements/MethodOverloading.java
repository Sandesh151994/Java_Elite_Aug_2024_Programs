package penta.basics.controlstatements;

public class MethodOverloading {

//	int a,b;
	
	
	void print()
	{
		System.out.println("Method with no arguments");
	}
	void print(int m)
	{
		System.out.println("Method with one argument : "+m);
	}
	void print(float m)
	{
		System.out.println("Method with same number of argument "
				+ "but with different datatype");
	}
	
	void print(int m,int n)
	{
		System.out.println("Method with different arguments");
	}
	void print(float m,int n)
	{
		System.out.println("Method with different arguments with different datatype");
	}
	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		m.print();
		m.print(23);
		m.print(34.56f);
		m.print(32.45f, 45);
		m.print(5,67);
		

	}

}
