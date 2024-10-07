package penta.java.oops;

class Outer
{
	int num=20;
	void disp()
	{
		System.out.println("Inside Outer class");
	}
	class Inner
	{
		int num1=56;
		void print()
		{
			
			System.out.println("Inside inner Class");
		}
		public static void main(String[] args) {
			
			System.out.println("Inner class Main method");
		}
	}
}
public class NestedInnerClass {

	public static void main(String[] args) {
		
		
		Outer out=new Outer();
		System.out.println(out.num);
		out.disp();
		
		//Outerclassname.InnerClassName innerref=outerref.new Innerclassname();
		Outer.Inner in=out.new Inner();
		in.print();
		

	}

}
