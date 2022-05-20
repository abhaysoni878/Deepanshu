// This Demo is for regular Inner class
class  Outer2
{
	int x=10;//instance Variable
	static int y=20;
	class Inner
	{
		void show()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String args[]) 
	{
		Outer2 o=new Outer2();
		System.out.println(o.x);
		Outer2.Inner i=o.new Inner();
		i.show();
	}
}
