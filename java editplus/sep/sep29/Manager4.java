class  E
{
	E()
	{
		System.out.println("E()");
	}
}
class F extends E
{
	F(int i)
	{
		System.out.println("F(int)");
	}
}
class Manager4
{
	public static void main(String[] args) 
	{
		E e1=new E();
		System.out.println("-------");
		F f1=new F(90);
	}
}
