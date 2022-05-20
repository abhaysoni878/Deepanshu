// This Demo is for Inner class can use each and every thing of the outer class(include private members)
class  MyOuter
{
	private int x=7;//instance variable
	public void makeInner()
	{
		System.out.println(x);
		MyInner in=new MyInner();//make an inner instance
		in.seeOuter();
	}
	class MyInner
	{
		public void seeOuter()
		{
			System.out.println("Outer x is "+x);
		}

	}//Inner class end
	public static void main(String args[]) 
	{
		MyOuter mo=new MyOuter();
		mo.makeInner();
		//System.out.println("Hello World!");
	}
}
