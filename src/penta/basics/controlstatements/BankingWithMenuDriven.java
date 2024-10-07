package penta.basics.controlstatements;

import java.util.Scanner;

public class BankingWithMenuDriven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the option");
		System.out.println("1. Deposite\n"
				+ "2. Withdrawl\n"
				+ "3. Balance Checking\n"
				+ "4. Exit");
		int option=sc.nextInt();
		
		int balance=1000;
		
		int amount;
		switch(option)
		{
		case 1: System.out.println("Enter the amount to deposite");
			amount=sc.nextInt();
			balance=balance+amount;
			System.out.println("Balance After Depositing : "+balance);
			break;
		case 2: System.out.println("Enter the amount to withdraw");
		amount=sc.nextInt();
		if(amount>balance)
		{
			System.out.println("Insufficient Balance");
		}
		else {
		balance=balance-amount;
		System.out.println("Balance After Withdrawl : "+balance);
		}
		break;
		
		case 3: System.out.println("Balance is : "+balance);
		break;
		case 4: System.out.println("Thank you for banking");
		break;
		
		default : System.out.println("Invalid option");
		}
		
	}

}
