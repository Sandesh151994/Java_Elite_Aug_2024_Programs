package penta.java.oops;

class Bank
{
	float rateOfInterest()
	{
		return 5.2f;
	}
}
class SBI extends Bank
{
	String bankname="SBI";
	
	@Override
	float rateOfInterest()
	{
		return 10;
	}
}
class AXIS extends Bank
{
	@Override
	float rateOfInterest()
	{
		return 14.5f;
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		
		AXIS axis=new AXIS();
		System.out.println(sbi.rateOfInterest());
		System.out.println(axis.rateOfInterest());
		

	}

}
