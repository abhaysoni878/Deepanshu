// This Demo is for the finally block
// java finally 10 2
class  FinallyDemo
{
	public static void main(String args[]) 
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=10/2;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.err.println("AE  "+e.getMessage());  //getMessage() is used to print original message of jre.
		}
		finally
		{
		System.out.println("Bye-Bye");
		}
	}
}
