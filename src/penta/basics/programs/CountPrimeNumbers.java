package penta.basics.programs;

import java.util.Iterator;
import java.util.Scanner;

public class CountPrimeNumbers {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		
		
		for (int i = 2; i <=n; i++) {
			int count=0;
			for (int j = 2; j <=i/2; j++) {
				
				if(i%j==0)
				{
					count++;
					break;
				}
				
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}

}
