package penta.java.exception;


public class Example1 {

	public static void main(String[] args) {
		
		
		System.out.println("Karthik has started his journey ");
		
		try
		{
			int arr[]= {2,4,5,6};
			System.out.println(arr[5]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Destination");
		
		
	}

}
