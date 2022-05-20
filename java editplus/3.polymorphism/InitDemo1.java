//this Demo is for IIB/Anonymous block
class InitDemo1 
{
	InitDemo1()
	{
		System.out.println("non param constructor is invoked");
	}
	InitDemo1( int num)
	{
		System.out.println("param constructor is invoked");
	}

	{
		System.out.println("I am IIB/Anonymous block");
	}
	public static void main(String args[]) 
	{
		InitDemo1 obj1=new InitDemo1();
		InitDemo1 obj2=new InitDemo1(10);
	}
}
