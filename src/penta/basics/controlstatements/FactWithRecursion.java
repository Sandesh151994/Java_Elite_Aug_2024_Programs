package penta.basics.controlstatements;

public class FactWithRecursion {

	int fact(int n)
	{

		if(n>=1)
		{
			return n*fact(n-1);
		}
		return 1;

	}

	public static void main(String[] args) {

		int num=5;
		FactWithRecursion f=new FactWithRecursion();
		int res=f.fact(num);
		System.out.println("Factorial of "+num+" is "+res);



	}

}
