package penta.basics.strings;

class Class
{
	static<E> void printData(E[] arr)
	{
		for(E ele:arr)
		{
			System.out.println(ele);
		}
	}
}
public class GenericsWithMethof {

	public static void main(String[] args) {
	
		int num=2345;
		Integer arr[]= {2,3,4,5};
		Class c=new Class();
		Class.printData(arr);
	}

}
