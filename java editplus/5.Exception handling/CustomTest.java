// In This program we use Custom Exception
class  CustomTest
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Throwing Custom Exception");
			throw new MyException("Hello i am abhay soni");
		}
		catch (MyException e)
		{
			System.out.println(e);
		}

	}
}
