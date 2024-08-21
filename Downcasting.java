class Downcasting
{
	
	public static void main(String[] args) {
		

		long num=21474836478l;

		int num1=(int)num;

		System.out.println("Converting from long to int "+num1);


		double d1=34.29059069734d;

		float d2=(float) d1;

		System.out.println("Converting from double to float "+d2);


		int num4=100;

		char m=(char) num4;

		System.out.println("Converting from int to char "+m);
	}
}