class  I
{
	{
		System.out.println("IIB 1");
	}
	static
	{
		System.out.println("SIB 1");
	}
	I()
	{
		System.out.println("I()");
	}
	{
		System.out.println("IIB 2");
	}
	static
	{
		System.out.println("SIB 2");
	}
	I(double d)
	{
		this();
		System.out.println("I(double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj1=new I();
		System.out.println("----");
		I obj2=new I(90.8);
		System.out.println("main-end");
	}
}
