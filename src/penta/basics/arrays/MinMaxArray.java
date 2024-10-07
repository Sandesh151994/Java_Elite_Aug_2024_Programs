package penta.basics.arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		
		int arr[]={34,22,12,100,89,200,5};
		int  min=arr[0];//34
		int max=arr[arr.length-1];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)// 34<34//22<34//12<22//45<12//89<12//5<12
			{
				min=arr[i];//min=22//min=12//min=5
			}
			else if(arr[i]>max)
			{
				max=arr[i];//5=34//max=45//max=100//200>100//max=200
			}
		}
		
		System.out.println("Minimum element is : "+min);
		System.out.println("Maximum is : "+max);
		
		

	}

}
