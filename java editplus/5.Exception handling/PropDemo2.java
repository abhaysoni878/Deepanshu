/*
Example which describes that checked exceptions can be propagated by throws keyword
*/
import java.io.IOException;
class  PropDemo2
{
	void method3()throws IOException
	{
		throw new IOException("device error");//checked exception
		//System.in.read();//it would throw IOException
	}
	void method2()throws IOException
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
			System.out.println("Exception handled "+e.getMessage());
		}
	}
	public static void main(String[] args) 
	{
		PropDemo2 obj=new PropDemo2();
		obj.method1();
		System.out.println("Normal Flow");
	}
}
