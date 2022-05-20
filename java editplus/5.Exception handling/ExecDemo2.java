	// This Demo is for multiple catch
	class  ExecDemo2
	{
		public static void main(String[] args) 
		{
			try
			{
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				int c=a/b;
				System.out.println(c);
			}
			catch (ArithmeticException e)
			{
				System.err.println("plz do not divide by zero");
			}
			catch(NumberFormatException e)
		{
			System.out.println("please enter only number");
		}
		catch(Exception e)
		{
			System.err.println("I Provide solution for all");
		//System.out.println("Hello World!");
		}
	}
}
