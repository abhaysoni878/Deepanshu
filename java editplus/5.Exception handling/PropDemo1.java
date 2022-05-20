//prg of Exception propagation(Unchecked Exception)
class  PropDemo1
{
	void method3()
	{
		int num=10/0;
	}
	void method2()
	{
		method3();
	}
	void method1()
	{
		try
		{
			method2();
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
	public static void main(String[] args) 
	{
		PropDemo1 obj=new PropDemo1();
		obj.method1();
		System.out.println("Normal Flow");
	}
}
