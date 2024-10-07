package penta.basics.controlstatements;

public class IfStatement {

	public static void main(String[] args) {


		char gender='F';
		
		String state="kar";
		
		boolean id=true;
		
		if(gender=='F')
		{
			System.out.println("Eligible for free bus pass");
			if(state=="kar")
			{
				System.out.println("Ok, check ID");
				if(id==true)
				{
					System.out.println("Issue a ticket");
				}
			}
			
			
		}


	}

}
