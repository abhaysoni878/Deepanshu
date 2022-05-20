class  SibDemo
{
	static int a=10;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	static
	{
		System.out.println("The value of A is "+a);
		System.out.println("static block is invoked");
	}
}
