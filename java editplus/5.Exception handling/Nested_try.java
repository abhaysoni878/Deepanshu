// This DEmo is for nested try and catch
class  Nested_Try
{
	public static void main(String[] args) 
	{
		try//Outer try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int result=0;
			try//inner try
			{
				result=a/b;
				System.out.println(result);
			}//inner try end
			catch(ArithmeticException e)//inner catch
			{
				System.out.println("divide by zero");
			}
		}//Outer try end
		catch(Exception e)//outer catch
		{
			System.out.println(e.getMessage());
			System.out.println("Incorrect argument type");
		}
	}
}
