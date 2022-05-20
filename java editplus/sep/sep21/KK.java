class  KK
{
	public static void main(String[] args) 
	{
		int i=0;
		//int j=i++ + test1(i++)+i;
		int j=i++ + test1(i++) + test2(++i);
		System.out.println(i);
		System.out.println(j);
		//System.out.println(test1(i));
	}
	static int test1(int i)
	{
		return ++i;
	}
	static int test2(int i)
	{
		return i++;
	}
}
