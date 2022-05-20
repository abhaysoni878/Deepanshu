abstract class  X
{
	static void test1()
	{
		System.out.println("test1");
	}
	static int i=10;
	void test2()
	{
		System.out.println("test2");
	}
}
interface Y
{
	static int j=20;
}
class Z
{
	public static void main(String[] args) 
	{
		X.test1();
		System.out.println(X.i);
		System.out.println(Y.j);
		//C c1=new C();
		//c1.test2();
		//C c2=null;
		//System.out.println("done");
	}
}
