class TooYoungException extends Exception
{
	TooYoungException(String s)
	{
		super(s);
	}
}
class TooOldException extends Exception
{
	TooOldException(String s)
	{
		super(s);
	}
}
class CustomExceptionDemo1
{
	public static void main(String[] args) 
	{
		try
		{
			int age=Integer.parseInt(args[0]);
			if(age>60)
			{
				throw new TooOldException("you are already crossed..no chance of getting married");
			}
			else if(age<21)
			{
				throw new TooYoungException("please wait some more time...it will get bestluck");
			}
			else
			{
				System.out.println("you will get email");
			}
		}
		catch (Exception e)
		{
			System.out.println("prob "+e.getMessage());
		}
		//System.out.println("Hello World!");
	}
}
