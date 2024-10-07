package penta.basics.strings;

class Demo<E>
{
	E obj;
	void setObj(E obj)
	{
		this.obj=obj;
	}
	
	E getObj()
	{
		return obj;
	}
}
public class GenericsExample {

	public static void main(String[] args) {
	
		Demo<Integer> d=new Demo<>();
		d.setObj(123);
		System.out.println(d.getObj());
		Demo<String> d1=new Demo<String>();
		d1.setObj("Java");
		System.out.println(d1.getObj());
//		d.setObj(456);
//		System.out.println(d.getObj());
	}

}
