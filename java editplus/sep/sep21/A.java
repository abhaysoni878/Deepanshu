class  A
{
	static void test()
	{
		System.out.println("from test:"+i);
	}
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("from main:"+i);
		i=1();
		test();
	}
}
