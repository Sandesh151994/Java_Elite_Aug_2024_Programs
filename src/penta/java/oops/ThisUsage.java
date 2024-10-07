package penta.java.oops;

public class ThisUsage {
	
	ThisUsage getObj()
	{
		return this;
	}
	
	void m1(ThisUsage t)
	{
		System.out.println("M1 method is calling");
	}
	void m2()
	{
		m1(this);
	}

	public static void main(String[] args) {
		
		
		ThisUsage t=new ThisUsage();
		System.out.println(t.getObj());
		t.m2();

	}

}
