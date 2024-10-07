package penta.basics.arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {


		int arr[]={23,45,67,89};

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the key to search");
		int key=sc.nextInt();
		
		int i;
		for ( i = 0; i < arr.length; i++) {

			if(key==arr[i])
			{
			
				System.out.println(key+" Found at "+i);
				break;
			}

		}
		if(i==arr.length)
		{
			
			System.out.println("Key Not Found");
		}

	}
}
