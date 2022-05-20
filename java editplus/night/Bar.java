class FOO 
{
	public int a;
	public FOO()
	{
		a=3;
	}
	public void addFive()
	{
		a+=5;
	}
}
public class Bar extends FOO
{
	public int a;
	public Bar()
	{
		a=8;
	}
	public void addFive()
	{
		this.a +=5;
	}
	public static void main(String[] args) 
	{
		FOO foo=new Bar();
		foo.addFive();
		System.out.println("Value:"+foo.a);
	}
}
