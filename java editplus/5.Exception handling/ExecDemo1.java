// This Demo is for try and catch
class  ExecDemo1
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("it is line-1");
			int a=10/0;   // it will risky task
			System.out.println("it is line 2");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Please do not divide by zero");
		}

		System.out.println("plz print me.....");
	}
}
