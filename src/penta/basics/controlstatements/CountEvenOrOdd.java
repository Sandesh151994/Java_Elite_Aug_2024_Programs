package penta.basics.controlstatements;

public class CountEvenOrOdd {

	public static void main(String[] args) {
		
		int n=50;
		System.out.println("Even numbers are");
		for (int i = 1; i<=n; i++) {
			
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
		System.out.println("Odd numbers are");
		for (int i = 1; i<=n; i++) {
			
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
		}

	}

}
