package penta.basics.arrays;

import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=sc.nextInt();
		
		System.out.println("Enter the col size");
		int col=sc.nextInt();
		
		
		int arr[][]=new int[row][col];
		System.out.println("Enter the elements into 2D Array ");
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < col; j++) {
				
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Elements are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("|");
			for (int j = 0; j < arr.length; j++) {
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.print("|");
			System.out.println();
		}
		
		

	}

}
