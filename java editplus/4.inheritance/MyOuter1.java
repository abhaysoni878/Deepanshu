class  MyOuter1
{
	private int x=7;
	public void makeInner()
	{
		System.out.println(x);
		MyInner in=new MyInner();
		in.seeOuter();
	}
	class MyInner
	{
		public void seeOuter()
		{
			System.out.println("Outer x is "+x);
		}
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		MyOuter1 mo=new MyOuter1();
		mo.makeInner();
	}
}
