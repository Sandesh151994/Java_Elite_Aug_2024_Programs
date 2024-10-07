package penta.java.exception;

import java.io.IOException;

/*If the superclass method declares an exception, 
 * subclass overridden method can declare same, 
 * subclass exception or no exception 
 * but cannot declare parent exception.

 */

class Parent
{
	void disp() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Hello world");
	}
}
class Child extends Parent
{
	@Override
	void disp() throws Exception
	{
		throw new ArrayIndexOutOfBoundsException();
	}
}
public class Scenario1 {

	public static void main(String[] args) throws IOException {
		
		Parent p=new Parent();
		p.disp();
		Child c=new Child();
		c.disp();

	}

}
