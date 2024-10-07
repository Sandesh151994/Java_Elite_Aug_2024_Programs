package penta.java.exception;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Source");
		try
		{
			int num=20/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Important statements to be executed"
					+ "regardless of exception is handled or not");
		}
		System.out.println("Destination");


	}

}
