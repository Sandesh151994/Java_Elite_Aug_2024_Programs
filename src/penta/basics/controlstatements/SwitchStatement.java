package penta.basics.controlstatements;

public class SwitchStatement {

	public static void main(String[] args) {
		
		
		int a=20,b=30;
		
		char op='*';
		
		int c;
		
		switch(op)
		{
		case '+': c=a+b;
			System.out.println("Addition : "+c);
			break;
			
		case '-':c=a-b;
			System.out.println("Subtraction : "+c);
			break;
	
		case '*':c=a*b;
			System.out.println("Multiplication : "+c);
			break;
			
		case '/':c=a/b;
			System.out.println("Division : "+c);
			break;
			
		case '%': c=a%b;
			System.out.println("Modulus : "+c);
			break;
	
			
		}
	}

}
