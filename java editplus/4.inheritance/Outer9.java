class  Outer9
{
	static int data=30;
	int var1=20;
	static void myMethod()
	{
		System.out.println("Outer Static method");
	}
	static class Inner
	{
		static void msg()
		{
			System.out.println("data is"+data); //okk
			//System.out.println("var1 is" +var1);//cte
		}
		void show()
		{
			System.out.println("Hello,I am non static show");
		}

	}//nested class end
	public static void main(String[] args) 
	{
		System.out.println(data);//okk
		myMethod();//okk
		//msg();
		Inner.msg();//ok
		//Inner.show();//not okk/CTE
		Inner obj=new Inner();
		obj.show();
	}
}//outer class end