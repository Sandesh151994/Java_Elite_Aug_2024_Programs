package penta.java.oops;

abstract class Application
{
	abstract void typeOfApp();
	
	void print()
	{
		System.out.println("Application software");
	}
}
class WhatsApp extends Application
{

	@Override
	void typeOfApp() {
		
		System.out.println("Messaging App");
	}
}
class Instagram extends Application
{

	@Override
	void typeOfApp() {
		
		System.out.println("Social Media App");
	}
	
}

public class AbstractionExample {

	public static void main(String[] args) {
//		
//		WhatsApp wts=new WhatsApp();
//		wts.typeOfApp();
//		
//		Instagram ins=new Instagram();
//		ins.typeOfApp();
		
		Application wts=new WhatsApp();
		wts.typeOfApp();
		
		wts.print();
		
		Application ins=new Instagram();
		ins.typeOfApp();
		
		
		
		
	}

}
