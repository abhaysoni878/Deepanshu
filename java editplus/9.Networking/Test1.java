//This program is retriving the class name
class  Simple
{
	int var1,var2;
}
class Test1
{
	public static void main(String args[])throws Exception
	{
		Class c=Class.forName("Simple");
		//Class c=Class.forName(args[0]);
		System.out.println("The class Name is"+c.getName());
	}
}
	
