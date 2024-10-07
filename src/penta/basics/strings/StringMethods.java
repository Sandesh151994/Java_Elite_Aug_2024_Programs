package penta.basics.strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String str="Garuda Gamana Vrishabha Vahana";
		System.out.println(str.length());
		System.out.println("Substring \n"+str.substring(7));
		System.out.println(str.substring(14,23));
		System.out.println(str.subSequence(0, 30));
		
		String strarr[]=str.split(" ");
		for (int i = 0; i < strarr.length; i++) {
			
			System.out.println(strarr[i]+" index "+i);
			
		}
		String str2=String.format("%10d", 123);
		System.out.println(str2);
		
		String str3="txn"+String.format("%010d", 1);
		System.out.println(str3);
		
		String name1="Abhirami";
		
		String name2=new String("abhirami");
		
		System.out.println(name1.equals(name2));
		
		System.out.println(name1.equalsIgnoreCase(name2));
		
		String name3="Abhiram";
		
		System.out.println(name3.compareTo(name1));
		
		
		String str5="Welcome to java programming";
		System.out.println(str5.length());
		
		System.out.println(str5.contains("javap"));
		
		System.out.println(str5.trim());
		System.out.println(str5.indexOf('g', 20));
		
		String str6=String.join("_", "Greatest","Of","All","Time");
		System.out.println(str6);
		
		String str7=str5.replace(str5, "Hello");
		System.out.println(str7);
		
		
		
	}

}
