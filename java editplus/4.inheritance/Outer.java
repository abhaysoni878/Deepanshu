//This Demo is for static nested class
class  Outer
{
	int x=10;
	static int y=20;
	static class Inner
	{
		void show()
		{
			System.out.println(y);
		}
	}//nested class end
		public static void main(String[] args) 
	{
		System.out.println(y);
		Inner i=new Inner();
		i.show();
	}
}
/*
In this demo,you need to create the object of static nested class because it has instance method show().
but you don't need to create the object of outer class because nested class is static and static properties
,methods or classes can be accessed without object.
*/