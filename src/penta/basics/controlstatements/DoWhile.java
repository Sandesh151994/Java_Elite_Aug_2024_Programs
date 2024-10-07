package penta.basics.controlstatements;

public class DoWhile {

	public static void main(String[] args) {

//		int i=1;
//		do {
//
//			System.out.println("Hello");
//			i++;
//		}while(i<=5);

		int i=1;
		while(i<=5)
		{
			System.out.println("Outer "+i);
			int j=1;
			while(j<=5)
			{

				System.out.println("Inner "+j);
				j++;
			}
			i++;
		}

	}

}
