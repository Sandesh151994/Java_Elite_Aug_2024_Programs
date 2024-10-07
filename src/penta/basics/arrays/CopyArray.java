package penta.basics.arrays;

public class CopyArray {

	public static void main(String[] args) {
	
		
		int a[]= {23,45,67,89,12};
		int b[]=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			
			b[i]=a[i];//b[0]=a[0]//b[1]=
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
