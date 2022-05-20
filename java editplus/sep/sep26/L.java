class  L
{
	L()
	{
		System.out.println("L");
	}
	L(int x)
	{
		System.out.println("L(int x)");
	}
	L(int x,int y)
	{
		System.out.println("int,int");
	}
	public static void main(String[] args) 
	{
		L l1=new L();
		System.out.println("Hello-----");
		L l2=new L(10);
		System.out.println("Hello-----");
		L l3=new L(10,4);
		System.out.println("Hello-----");
	}
}
