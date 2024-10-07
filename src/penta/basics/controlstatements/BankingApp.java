package penta.basics.controlstatements;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		float balance=1000;

		while(true)
		{
		System.out.println("Choose Option");
		System.out.println("1.Deposite\n2.Withdrawl\n3.Check Balance\n"
				+ "4.Exit\n");

		int  option=sc.nextInt();

		float amount;

		switch(option)
		{
		case 1: System.out.println("Enter the amount to deposite");
		amount=sc.nextFloat();
		balance=balance+amount;
		System.out.println("Deposited Amount is "+amount);
		System.out.println("Balance After Deposite "+balance);
		break;

		case 2: System.out.println("Enter the amount to withdraw");
		amount=sc.nextFloat();
		balance=balance-amount;
		System.out.println("Withdrawl amount is "+amount);
		System.out.println("Balance after withdrawl "+balance);
		break;

		case 3: System.out.println("Balance is "+balance);
		break;
		case 4:System.out.println("Thank you for banking");
		return;
		default : System.out.println("Invalid option");
		}
		}

	}

}
