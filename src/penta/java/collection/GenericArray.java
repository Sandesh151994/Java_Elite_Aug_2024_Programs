package penta.java.collection;

import java.util.Arrays;

public class GenericArray {
	
	static public<T> void disp(T arr[])
	{
		for(T i:arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		Integer a[]= {1,2,3,4,5};
	
		GenericArray.disp(a);
		
	}

}
