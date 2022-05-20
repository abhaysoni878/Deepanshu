class  M
{
	
	M(int x)
	{
		System.out.println("L(int x)");
	}
	M(int x,int y)
	{
		this();
		System.out.println("int,int");
	}
	M()
	{
		System.out.println("L");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello-----");
		M M2=new M(10);
		System.out.println("Hello-----");
		M M3=new M(10,4);
		System.out.println("Hello-----");
		M m1=new M();
	}
}
