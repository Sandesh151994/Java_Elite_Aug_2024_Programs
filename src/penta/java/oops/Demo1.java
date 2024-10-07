package penta.java.oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo1 implements Cloneable {


//	int price;
//	String name;
//	
////	public Demo1(int price, String name) {
////		this.price = price;
////		this.name = name;
////	}
//	
//	@Override
//	public String toString()
//	{
//		return "Name : "+name+" Price : "+price;
//	}
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
	
//		Demo1 d=new Demo1(200,"Chicken");
//		System.out.println(d);
		
		Demo1 d1=new Demo1();
		
		System.out.println(d1);
		
		Demo1 d2=(Demo1 )d1.clone();
		System.out.println(d2);
		
		Demo1 d3=Demo1.class.newInstance();// with newInstance() method
		System.out.println(d3);
		
		Constructor<Demo1> d4=Demo1.class.getConstructor();
		
		Demo1 d5=d4.newInstance();
		System.out.println(d5);
		
		System.out.println('J'+'A'+'V'+'A');
		int i=0;
		int j=i;
		j=(i++) + j;//(0++)+0
		System.out.println(j);
		System.out.println(i);
		
	}
	
	

}
