class  I
{
	public static void main(String[] args) 
	{
		int i=10;
		System.out.println(test(i));
		System.out.println(test(i));
	}
	static int test(int i)
	{
		return ++i;
	}
}
