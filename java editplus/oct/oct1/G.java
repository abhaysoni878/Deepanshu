abstract class  F
{
	abstract void test();
	abstract void test(int i);
	void test(int i,int j)
	{
		System.out.println("test(int ,int)");
	}
}
class G extends F
{
	void test()
	{
		System.out.println("test1");
	}
	void test(int i)
	{
		System.out.println("test(int)");
	}
	public static void main(String[] args) 
	{
		G g1=new G();
		g1.test();
		g1.test(10);
		g1.test(1,20);
		System.out.println("done");
	}
}