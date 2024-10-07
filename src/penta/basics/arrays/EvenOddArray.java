package penta.basics.arrays;

public class EvenOddArray {

	public static void main(String[] args) {
		
		int arr[]= {23,12,45,32,67,89};
		
		int ecount=0,ocount=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		int evenarr[]=new int[ecount];
		
		int oddarr[]=new int[ocount];
		int j=0,k=0;
		for (int i = 0; i < arr.length; i++) {
			
			
			if(arr[i]%2==0)
			{
				
				evenarr[j]=arr[i];
				j++;
			}
			else
			{
				oddarr[k]=arr[i];
				k++;
			}
			
		}
		System.out.println("Even elements");
		for (int i = 0; i < evenarr.length; i++) {
			
			System.out.println(evenarr[i]);
			
		}
		System.out.println("Odd elements");
		for (int i = 0; i < oddarr.length; i++) {
			
			System.out.println(oddarr[i]);
			
		}
		
		

	}

}
