package penta.basics.controlstatements;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i!=0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(" Prime Number ");
		}
		else
		{
			System.out.println("Not a prime number ");
		}

	}

}
