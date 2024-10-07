package penta.basics.strings;

public class StringBuf {

	public static void main(String[] args) {
		
		
		StringBuffer buff=new StringBuffer("Hello");
		buff.append("World");
	
		System.out.println(buff);
		
		StringBuilder builder=new StringBuilder("Java");
		
		builder.append("Programming");
		System.out.println(builder);
		
		String str=buff.toString();
		

	}

}
