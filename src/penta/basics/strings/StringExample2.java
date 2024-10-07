package penta.basics.strings;

public class StringExample2 {

	public static void main(String[] args) {
		
		String str="Chiranth";
		//C=0,h=1,i=2,r=3,a=4,n=5,t=6,h=7;
//		System.out.println(str.charAt(2));
		// to get character based on index
		System.out.println("Length is "+str.length());
		// to get length of the string
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+" pos is "+i);
			
		}
		
		

	}

}
