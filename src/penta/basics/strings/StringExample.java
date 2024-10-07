package penta.basics.strings;

public class StringExample {

	public static void main(String[] args) {
		
		
		
		String str1="Java";
		String str2=new String("Java");
		System.out.println(str1==str2);
		
		String str3=str2.intern();
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		
		StringExample obj1=new StringExample();
		StringExample obj2=obj1;
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		String str=String.format("|%-10d|", 1);
		System.out.println(str);
		
		
	}

}
