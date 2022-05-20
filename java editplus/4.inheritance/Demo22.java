class  Outer44
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
}
class Demo22 extends Outer44.Inner
{
	public static void main(String[] args) 
	{
		msg();
		Demo22 obj=new Demo22();
		obj.show();
		System.out.println("Hello World!");
	}
}