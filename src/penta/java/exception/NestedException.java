package penta.java.exception;

public class NestedException {

	public static void main(String[] args) {
		
		System.out.println("Starting");
		try
		{
			
			try
			{
				int ar[]= {2,3,4,5,6};
				System.out.println(ar[6]);
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Ending");
		
		

	}

}
