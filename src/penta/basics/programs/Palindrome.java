package penta.basics.programs;

public class Palindrome {

	public static void main(String[] args) {
	
		int n=123454321;
		int rev=0,rem=0;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	

	}

}
