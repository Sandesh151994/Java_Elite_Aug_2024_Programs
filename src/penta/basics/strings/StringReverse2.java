package penta.basics.strings;

public class StringReverse2 {

	public static void main(String[] args) {
		
		
		String str="Abhirami Karthik";
					//imarihbA kihtraK
		
		String arr[]=str.split(" ");
		
		String rev="";
		
		for (int i = 0; i < arr.length; i++) {
			
			String word=arr[i];// Karthik
			for (int j = word.length()-1; j>=0; j--) {
				
				rev=rev+word.charAt(j);//imarihbA +"kihtraK" 
				
			}
			rev=rev+" ";
			
		}
		System.out.println(rev);
		
		

	}

}
