package penta.basics.controlstatements;

public class BankingAppUsingSwitch {

	public static void main(String[] args) {


		float balance=1000;
		
		String option="abcd";
		
		float amount=500;
		
		switch(option)
		{
		case "deposite": balance=balance+amount;
		System.out.println("Balance After Deposite "+balance);
		break;
		
		case "withdrawl": balance=balance-amount;
		System.out.println("Balance after withdrawl "+balance);
		break;
		
		case "balance": System.out.println("Balance is "+balance);
		break;
		default : System.out.println("Invalid option");
		}

	}

}
