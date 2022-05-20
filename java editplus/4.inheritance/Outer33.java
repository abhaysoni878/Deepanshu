class  Outer33
{
	static int data=30;
	static class Inner
	{
		static void msg()
		{
			System.out.println("data is"+data);
		}
		void show()
		{
			System.out.println("I am non static show");
		}
	}//nested class end
}//outer33classend
class Demo
{
	public static void main(String[] args) 
	{
		System.out.println(Outer33.data);
		Outer33.Inner.msg();
		Outer33.Inner i=new Outer33.Inner();
		i.show();
		System.out.println("Hello World!");
	}
}