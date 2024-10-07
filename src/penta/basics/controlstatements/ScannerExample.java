package penta.basics.controlstatements;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a value ");
		int a=sc.nextInt();
		System.out.println("Value is "+a);

		System.out.println("Enter String value");
		String name=sc.next(); // it will read upto whitespace
		//after it will not read

		System.out.println("String value is "+name);

		System.out.println("Enter String value");
		sc.next();
		String str=sc.nextLine();

		System.out.println("String value is "+str);


	}

}
