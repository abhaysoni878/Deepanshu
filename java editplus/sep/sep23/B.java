class  B
{
	static int i;
	static int j=10;
	static
	{
		System.out.println("B-SIB");
	}
	static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}

}
/*class L
{
	static
	{
		System.out.println("L-SIB");
	}
	
		System.out.println("-----aaa-----");
		K.test();
		System.out.println("-----bbb-----");
		K.test();
		System.out.println("-----ccc-----");
		System.out.println(K.i);
		System.out.println("-----ddd-----");
	}
}
*/