class  F
{
	F()
	{
		System.out.println("F()");
	}
	{
		System.out.println("start");
	}
	F(int i)
	{
		this();
		System.out.println("end");
	}
	public static void main(String[] args) 
	{
		F f1=new F();
		System.out.println("-------");
		F f2=new F(20);
	}
}
