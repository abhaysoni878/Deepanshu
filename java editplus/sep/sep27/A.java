class  A
{
	A()
	{
		System.out.println("A()");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	{
		System.out.println("IIB 3");
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("----------");
		A a2=new A();
		System.out.println("----------");
	}
}
