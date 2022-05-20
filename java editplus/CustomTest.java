class CustomTest 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Throwing custom Exception");
			throw new MyException();
		}
		catch (MyException e)
		{
			System.out.println(e);
		}
		//System.out.println("Hello World!");
	}
}
