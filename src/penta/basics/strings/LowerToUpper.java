package penta.basics.strings;

public class LowerToUpper {

	public static void main(String[] args) {
		
		String str1="Hello World";
		String str="gAuThAm";
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)>=97&&str.charAt(i)<=122)//g-
			{
				System.out.print((char)((str.charAt(i))-32));
			}
			else
			{
				System.out.print((char)((str.charAt(i))+32));
			}
		}

	}

}
