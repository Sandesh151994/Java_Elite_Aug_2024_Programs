package penta.basics.strings;

public class VowelsConsonants {

	public static void main(String[] args) {
		
		String str="Hello W#or$l%d";
		str=str.toLowerCase();
		
		int vcount=0,ccount=0,sccount=0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='o')
			{
				vcount++;
			}
			else if(str.charAt(i)>=97&&str.charAt(i)<=122)
			{
				ccount++;
			}
			else
			{
				sccount++;
			}
		}
		System.out.println("Vowels  are "+vcount);
		System.out.println("Consonants are "+ccount);
		System.out.println("Special Characters are "+sccount);
		
		int a=0x032;
		System.out.println(a);

	}

}
