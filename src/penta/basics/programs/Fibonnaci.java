package penta.basics.programs;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int count=sc.nextInt();
		
		int n1=0,n2=1,n3=0;
		
		System.out.println("==Fibonacci Series are==");
		while(count>0)
		{
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
			count--;
		}
	
	}

}
