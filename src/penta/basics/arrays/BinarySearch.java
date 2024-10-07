package penta.basics.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int arr[]= {20,45,67,89,95};
		
		int low=0;
		int high=arr.length-1;
		int mid;
		System.out.println("ENter the key ");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		
		while(low<=high)
		{
			mid=(low+high)/2;
//			System.out.println(mid);
			if(arr[mid]<key)
			{
				low=mid+1;
			}
			else if(key==arr[mid])
			{
				System.out.println(key+" Found at "+mid);
				break;
			}
			else
			{
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if(low>high)
		{
			System.out.println("Not found ");
		}	

	}

}
