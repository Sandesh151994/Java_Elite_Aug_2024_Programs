package penta.java.collection;
/*
 * T- Type
 * E- Elements
 * G- Generics
 * K- Key
 * V- Value
 * ?- List Of anytype of elements
 */
class Demo<T>
{
	T obj;
	Demo(T obj)
	{
		this.obj=obj;
	}
	static public<T> void setObj(T obj)
	{
		System.out.println(obj);
	}
}
public class Generics {

	public static void main(String[] args) {
		
		Demo<String> d=new Demo<String>("ABC");
		System.out.println(d.obj);
		
		Demo.setObj("XYZ");
	}

}
