package penta.basics.controlstatements;

public class CapitalSmall {

	public static void main(String[] args) {
		
		char c='h';
		if(c>='A'&&c<='Z')
		{
			System.out.println((char)(c+32));
		}
		else if(c>='a'&&c<='z')
		{
			System.out.println((char)(c-32));
		}

	}

}
