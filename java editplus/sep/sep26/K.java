class  K
{
	K(int x,int y)
	{
		System.out.println("int,int");
	}
	K(double x,int y)
	{
		System.out.println("double,int");
	}
	public static void main(String[] args) 
	{
		K k1=new K(10,5);
		System.out.println("Hello-----");
		K k2=new K(10.5,5);
	}
}
